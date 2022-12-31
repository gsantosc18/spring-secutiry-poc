package com.gedalias.securitypoc.config.security.service;

import com.gedalias.securitypoc.config.security.dto.CreatedUserDto;
import com.gedalias.securitypoc.config.security.dto.UserDto;
import com.gedalias.securitypoc.config.security.entity.User;
import com.gedalias.securitypoc.config.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário ou senha inválidos"));
    }

    public CreatedUserDto save(UserDto userDto) {
        User user = new User(userDto.name(), passwordEncoder.encode(userDto.password()));
        user.setRoleTypes(userDto.roleTypes());
        User savedUser = userRepository.save(user);
        return new CreatedUserDto(savedUser.getId(), savedUser.getName(), savedUser.getRoleTypes(), savedUser.getCreatedAt());
    }
}

package com.gedalias.securitypoc.config.security.repository;

import com.gedalias.securitypoc.config.security.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByName(String name);
}

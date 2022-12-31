package com.gedalias.securitypoc.config.security.dto;

import com.gedalias.securitypoc.config.security.enums.RoleType;

import java.time.LocalDateTime;
import java.util.Set;

public record CreatedUserDto(
        String id,
        String name,
        Set<RoleType> roleTypes,
        LocalDateTime createdAt
) {
}

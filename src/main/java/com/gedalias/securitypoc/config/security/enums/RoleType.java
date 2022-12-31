package com.gedalias.securitypoc.config.security.enums;

public enum RoleType {
    ADMIN("ROLE_ADMIN"), USER("ROLE_USER");

    private final String role;

    RoleType(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

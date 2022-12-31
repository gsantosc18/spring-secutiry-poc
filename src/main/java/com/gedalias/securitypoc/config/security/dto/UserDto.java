package com.gedalias.securitypoc.config.security.dto;

import com.gedalias.securitypoc.config.security.enums.RoleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

public record UserDto(
   @NotBlank(message = "É obrigatório fornecer um nome")
   String name,
   @NotBlank(message = "É obrigatório fornecer uma senha")
   String password,
   @NotEmpty(message = "É obrigatório fornecer uma lista de funções")
   Set<RoleType> roleTypes
) {}

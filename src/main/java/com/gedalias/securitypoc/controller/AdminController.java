package com.gedalias.securitypoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin")
    public String onlyAdmins() {
        return "Somente usuário com perfil de admin tem acesso a essa página";
    }
}

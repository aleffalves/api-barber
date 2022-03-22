package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.modelDTO.LoginDTO;
import com.github.aleffalves.apibarber.modelDTO.SessaoDTO;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import com.github.aleffalves.apibarber.security.JWTCreator;
import com.github.aleffalves.apibarber.security.JWTObject;
import com.github.aleffalves.apibarber.security.SecurityConfig;
import com.github.aleffalves.apibarber.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/login")
@CrossOrigin(origins = {"http://localhost:4200", "https://aleffalves.github.io"})
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping()
    public SessaoDTO logar(@RequestBody LoginDTO login){
       return loginService.logar(login);
    }
}
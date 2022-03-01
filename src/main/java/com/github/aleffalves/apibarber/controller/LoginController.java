package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.modelDTO.LoginDTO;
import com.github.aleffalves.apibarber.modelDTO.SessaoDTO;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import com.github.aleffalves.apibarber.security.JWTCreator;
import com.github.aleffalves.apibarber.security.JWTObject;
import com.github.aleffalves.apibarber.security.SecurityConfig;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/login")
@CrossOrigin(origins = {"http://localhost:4200", "https://aleffalves.github.io"})
public class LoginController {

    private final PasswordEncoder encoder;
    private final SecurityConfig securityConfig;
    private final UsuarioRepository usuarioRepository;

    public LoginController(PasswordEncoder encoder, SecurityConfig securityConfig, UsuarioRepository usuarioRepository) {
        this.encoder = encoder;
        this.securityConfig = securityConfig;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping()
    public SessaoDTO logar(@RequestBody LoginDTO login){
        Usuario usuario = usuarioRepository.findByEmail(login.getEmail());
        if(usuario !=null ) {
            boolean senhaOk =  encoder.matches(login.getSenha(), usuario.getSenha());
            if (!senhaOk) {
                throw new RuntimeException("Senha inválida para o login: " + login.getEmail());
            }
            //Estamos enviando um objeto Sessão para retornar mais informações do usuário
            SessaoDTO sessao = new SessaoDTO();
            sessao.setLogin(usuario.getEmail());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration((new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION)));
            jwtObject.setRoles(usuario.getRoles());
            sessao.setToken(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
            return sessao;
        }else {
            throw new RuntimeException("Erro ao tentar fazer login");
        }
    }
}
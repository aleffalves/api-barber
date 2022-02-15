package com.github.aleffalves.apibarber.service;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder encoder;

    public ServiceUsuario(UsuarioRepository usuarioRepository, PasswordEncoder encoder) {
        this.usuarioRepository = usuarioRepository;
        this.encoder = encoder;
    }

    public void criarUsuario(Usuario usuario){
        String senha = usuario.getSenha();
        usuario.setSenha(encoder.encode(senha));
        usuarioRepository.save(usuario);
    }
}

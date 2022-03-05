package com.github.aleffalves.apibarber.service;

import com.github.aleffalves.apibarber.mapper.UsuarioMapper;
import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.modelDTO.UsuarioDTO;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder encoder;
    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder encoder, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.encoder = encoder;
        this.usuarioMapper = usuarioMapper;
    }

    public void criarUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioMapper.usuarioParaUsuarioDTO(usuarioDTO);
        String senha = usuario.getSenha();
        usuario.setSenha(encoder.encode(senha));
        usuarioMapper.usuarioDTOParaUsuario(usuarioRepository.save(usuario));
    }
}

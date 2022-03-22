package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.modelDTO.UsuarioDTO;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import com.github.aleffalves.apibarber.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/usuario")
@CrossOrigin(origins = {"http://localhost:4200", "https://aleffalves.github.io"})
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioRepository usuarioRepository, UsuarioService usuarioService) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioService = usuarioService;
    }

    @PostMapping()
    public void cadastroUsuario(@RequestBody UsuarioDTO usuario){
        usuarioService.criarUsuario(usuario);
    }

    @GetMapping("{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Integer id){
        return usuarioRepository.findById(id).orElseThrow();
    }
}

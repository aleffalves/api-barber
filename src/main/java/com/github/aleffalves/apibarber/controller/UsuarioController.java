package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import com.github.aleffalves.apibarber.service.ServiceUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/usuario")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final ServiceUsuario serviceUsuario;

    public UsuarioController(UsuarioRepository usuarioRepository, ServiceUsuario serviceUsuario) {
        this.usuarioRepository = usuarioRepository;
        this.serviceUsuario = serviceUsuario;
    }

    @PostMapping()
    public void cadastroUsuario(@RequestBody Usuario usuario){
        serviceUsuario.criarUsuario(usuario);
    }

    @GetMapping("{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Integer id){

        return usuarioRepository.findById(id).orElseThrow();
    }
}

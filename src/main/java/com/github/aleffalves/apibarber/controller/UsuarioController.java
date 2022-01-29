package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    @GetMapping("{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Integer id){
       return usuarioRepository.findById(id).orElseThrow();
    }
}

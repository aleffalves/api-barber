package com.github.aleffalves.apibarber.controller;

import com.github.aleffalves.apibarber.model.Horarios;
import com.github.aleffalves.apibarber.modelDTO.HorariosDTO;
import com.github.aleffalves.apibarber.service.HorariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/horarios")
@CrossOrigin(origins = {"http://localhost:4200", "https://aleffalves.github.io"})
public class HorariosController {

    private final HorariosService horariosService;

    public HorariosController(HorariosService horariosService) {
        this.horariosService = horariosService;
    }

    @PostMapping()
    public void criarHorario(@RequestBody HorariosDTO horarios){
        horariosService.criarHorario(horarios);
    }

    @GetMapping()
    public List<Horarios> buscarHorarios(){
       return horariosService.buscarTodosHorarios();
    }
}

package com.github.aleffalves.apibarber.service;

import com.github.aleffalves.apibarber.mapper.HorariosMapper;
import com.github.aleffalves.apibarber.model.Horarios;
import com.github.aleffalves.apibarber.modelDTO.HorariosDTO;
import com.github.aleffalves.apibarber.repository.HorariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorariosService {

    private final HorariosRepository horariosRepository;
    private final HorariosMapper horariosMapper;

    public HorariosService(HorariosRepository horariosRepository, HorariosMapper horariosMapper) {
        this.horariosRepository = horariosRepository;
        this.horariosMapper = horariosMapper;
    }

    public void criarHorario(HorariosDTO horariosDTO){
        Horarios horarios = horariosMapper.horariosParaHorariosDTO(horariosDTO);
        horariosRepository.save(horarios);
    }

    public List<Horarios> buscarTodosHorarios(){
        return horariosRepository.findAll();
    }
}

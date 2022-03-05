package com.github.aleffalves.apibarber.mapper;

import com.github.aleffalves.apibarber.model.Horarios;
import com.github.aleffalves.apibarber.modelDTO.HorariosDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HorariosMapper {

    public Horarios horariosParaHorariosDTO(HorariosDTO dto);
    public HorariosDTO horariosDTOParaHorarios(Horarios horarios);
}

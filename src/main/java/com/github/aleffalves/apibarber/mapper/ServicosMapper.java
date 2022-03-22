package com.github.aleffalves.apibarber.mapper;

import com.github.aleffalves.apibarber.model.Servicos;
import com.github.aleffalves.apibarber.modelDTO.ServicosDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServicosMapper {

    public Servicos servicosParaServicosDTO(ServicosDTO dto);
    public ServicosDTO servicosDTOParaServicos(Servicos servicos);
}

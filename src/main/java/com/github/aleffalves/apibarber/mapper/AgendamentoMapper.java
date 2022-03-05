package com.github.aleffalves.apibarber.mapper;

import com.github.aleffalves.apibarber.model.Agendamento;
import com.github.aleffalves.apibarber.modelDTO.AgendamentoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    public Agendamento agendamentoParaAgendamentoDTO(AgendamentoDTO dto);
    public AgendamentoDTO agendamentoDTOParaAgendamento(Agendamento agendamento);
}

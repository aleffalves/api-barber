package com.github.aleffalves.apibarber.mapper;

import com.github.aleffalves.apibarber.model.Usuario;
import com.github.aleffalves.apibarber.modelDTO.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    public Usuario usuarioParaUsuarioDTO(UsuarioDTO dto);
    public UsuarioDTO usuarioDTOParaUsuario(Usuario usuario);
}

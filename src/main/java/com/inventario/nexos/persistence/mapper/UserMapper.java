package com.inventario.nexos.persistence.mapper;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.User;
import com.inventario.nexos.persistence.entity.Pieza;
import com.inventario.nexos.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source="idUsuario", target="idUser"),
            @Mapping(source="usuario", target="name"),
            @Mapping(source="edad", target="age"),
            @Mapping(source="cargo", target="rolluser"),
            @Mapping(source="fechaIngreso", target="datein"),
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mapping(target="piezas", ignore=true)
    Usuario toUsuario(User user);

}

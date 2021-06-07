package com.inventario.nexos.persistence.mapper;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.persistence.entity.Pieza;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses={UserMapper.class})
public interface PartMapper {

    @Mappings({
            @Mapping(source="idPieza", target="idPart"),
            @Mapping(source="pieza", target="part"),
            @Mapping(source="usuario", target="user"),
            @Mapping(source="cantidad", target="quantity"),
            @Mapping(source="fechaInventario", target="dateRegister"),
            @Mapping(source="usuarioEncargado", target="usercharged"),
            @Mapping(source="idUsuario", target="idUser")
    })
    Part toPart(Pieza pieza);
    List<Part> toParts(List<Pieza> piezas);

    @InheritInverseConfiguration
    Pieza toPieza(Part part);




}

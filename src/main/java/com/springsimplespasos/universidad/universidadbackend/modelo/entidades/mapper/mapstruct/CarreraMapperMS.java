package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.mapper.mapstruct;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto.CarreraDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CarreraMapperMS {

    @Mappings({
            @Mapping(source = "id",target = "codigo"),
            @Mapping(source = "cantidadMaterias",target = "cantidad_materias"),
            @Mapping(source = "cantidadAnios",target = "cantidad_anios"),
    })
    CarreraDTO mapCarrera(Carrera carrera);
}

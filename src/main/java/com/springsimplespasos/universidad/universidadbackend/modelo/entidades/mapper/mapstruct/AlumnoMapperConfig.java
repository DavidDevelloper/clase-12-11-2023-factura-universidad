package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.mapper.mapstruct;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto.AlumnoDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig
public interface AlumnoMapperConfig extends PersonaMapperConfig {
    @InheritConfiguration(name = "mapPersona")
    void mapAlumno(Alumno alumno, @MappingTarget AlumnoDTO alumnoDTO);
}

package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.mapper.mapstruct;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto.CarreraDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-11T15:21:30-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class CarreraMapperMSImpl implements CarreraMapperMS {

    @Override
    public CarreraDTO mapCarrera(Carrera carrera) {
        if ( carrera == null ) {
            return null;
        }

        CarreraDTO carreraDTO = new CarreraDTO();

        carreraDTO.setCodigo( carrera.getId() );
        carreraDTO.setCantidad_materias( carrera.getCantidadMaterias() );
        carreraDTO.setCantidad_anios( carrera.getCantidadAnios() );
        carreraDTO.setNombre( carrera.getNombre() );

        return carreraDTO;
    }
}

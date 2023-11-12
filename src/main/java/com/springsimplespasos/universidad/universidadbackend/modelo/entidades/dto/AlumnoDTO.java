package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AlumnoDTO extends PersonaDTO{

    public AlumnoDTO(Integer id, String nombre, String apellido, @Pattern(regexp = "[0-9]+") @Size(min = 1, max = 10) String dni, Direccion direccion) {
        super(id, nombre, apellido, dni, direccion);
    }
}

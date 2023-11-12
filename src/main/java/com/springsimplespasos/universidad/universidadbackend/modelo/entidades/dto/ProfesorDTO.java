package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProfesorDTO extends PersonaDTO{
    private BigDecimal sueldo;
    public ProfesorDTO(Integer id, String nombre, String apellido, String dni, Direccion direccion,BigDecimal sueldo) {
        super(id, nombre, apellido, dni, direccion);
        this.sueldo=sueldo;
    }
}

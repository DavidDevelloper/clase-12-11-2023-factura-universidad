package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.math.BigDecimal;

public class EmpleadoDTO extends ProfesorDTO{
    private BigDecimal sueldo;
    private TipoEmpleado tipoEmpleado;
    public EmpleadoDTO(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo,TipoEmpleado tipoEmpleado) {
        super(id, nombre, apellido, dni, direccion, sueldo);
        this.sueldo=sueldo;
        this.tipoEmpleado=tipoEmpleado;
    }
}

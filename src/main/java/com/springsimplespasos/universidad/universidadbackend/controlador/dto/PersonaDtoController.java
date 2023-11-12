package com.springsimplespasos.universidad.universidadbackend.controlador.dto;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Empleado;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Profesor;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto.PersonaDTO;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.mapper.mapstruct.AlumnoMapper;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

public class PersonaDtoController extends GenericDtoController<Persona, PersonaDAO> {

    protected final AlumnoMapper alumnoMapper;


    public PersonaDtoController(PersonaDAO sevice, String nombre_entidad, AlumnoMapper alumnoMapper) {
        super(sevice, nombre_entidad);
        this.alumnoMapper = alumnoMapper;
    }

    public PersonaDTO altaPersona(Persona persona){
        Persona personaEntidad = super.altaEntidad(persona);
        PersonaDTO dto = null;
        if(personaEntidad instanceof Alumno){
            dto = alumnoMapper.mapAlumno((Alumno)personaEntidad);
        } else if (personaEntidad instanceof Profesor) {
            //
        } else if (personaEntidad instanceof Empleado) {
            //
        }
        return dto;
    }
    public PersonaDTO buscarPersonaPorId(Integer id){
        Optional<Persona> oPersona = super.optenerPorId(id);
        Persona persona;
        PersonaDTO dto = null;
        if (oPersona.isEmpty()){
            return null;
        }else{
            persona=oPersona.get();
        }
        if (persona instanceof  Alumno){
            dto =alumnoMapper.mapAlumno((Alumno) persona);
        } else if (persona instanceof Profesor) {
            //
        } else if (persona instanceof Empleado) {
            //
        }
        return dto;
    }
}

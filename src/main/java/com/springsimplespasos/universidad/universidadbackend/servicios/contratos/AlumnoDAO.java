package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;


import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoDAO extends PersonaDAO {

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);

}

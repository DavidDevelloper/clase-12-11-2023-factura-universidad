package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.*;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication {
	//@Autowired
	//private AlumnoDAO service;
	//private CarreraDAO service1;


	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
		/*for(String str : beanDefinitionNames){
			System.out.println(str);
		*/}
	}
	//esta es otra manera de mandar datos a la base de datos desde el main
	/*@Bean
	public CommandLineRunner runner(){
		return args -> {
			Direccion direccion = new Direccion("santos","646","1068","san vicente","","guadalupe");
			Profesor profesor = new Profesor(null,"henrry","moreales","004040", direccion,new BigDecimal(400));
			Persona save = service.save(profesor);
			System.out.println(save.toString());
		};
	}*/
	/*@Bean
	public CommandLineRunner runner(){
		return args -> {
			Direccion direccion = new Direccion("santos","646","1068","san vicente","","guadalupe");
			Empleado empleado = new Empleado(null,"mauricio","gonzales","7772323",direccion ,new BigDecimal(200), TipoEmpleado.MANTENIMIENTO);
			Persona save = service.save(empleado);
			Direccion direccion1 = new Direccion("lagos","925","3322","santa ana","","santa ana");
			Empleado empleado1 = new Empleado(null,"rodrigo","mendez","408026",direccion1, new BigDecimal(400),TipoEmpleado.ADMINISTRATIVO);
			Persona save1 = empleado1;
			System.out.println(save1.toString());
		};
	}*/

	/*public CommandLineRunner runner(){
		return args -> {
			Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5,null, null);

			Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial", 55, 5, null, null);
			Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53, 5, null, null);
			Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45, 5, null, null);
			Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas", 40, 4, null, null);
			Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo", 42, 4, null, null);
			Carrera licYoga = new Carrera(null, "Licenciatura en Yoga", 25, 3, null, null);
			Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos - RRHH", 33, 3, null, null);
			service1.save(ingIndustrial);
			service1.save(ingAlimentos);
		};
	}*/







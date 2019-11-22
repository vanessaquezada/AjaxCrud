package com.proyecto.personal.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.personal.entidades.Persona;

public interface IPersonaRepository extends CrudRepository<Persona,Integer>{

}

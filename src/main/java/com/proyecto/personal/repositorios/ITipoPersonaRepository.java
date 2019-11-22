package com.proyecto.personal.repositorios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.personal.entidades.TipoPersona;

@Repository
public interface ITipoPersonaRepository extends CrudRepository<TipoPersona, Integer>{

}

package com.apirest.app.Evento;

import org.springframework.data.repository.CrudRepository;


//------------------Repositorio donde se guardan los registros del modelo (restaurante)-----------------


//This will be AUTO IMPLEMENTED by Spring into a Bean called restauranteRepository
//CRUD refers Create, Read, Update, Delete

public interface EventoRepository extends CrudRepository<Evento, Integer>{

}

// Spring automatically implements this repository interface in a bean that has the same name 
// (with a change in the case — it is called restauranteRepository).
package com.main.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Estudiantes;

@Repository
public interface EstudiantesRepository extends ReactiveMongoRepository<Estudiantes, String>{

}

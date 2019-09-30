package com.main.service;



import com.main.model.Estudiantes;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EstudiantesService {

	Mono<Estudiantes> createEstudiantes(Estudiantes estudiante);

	Mono<Estudiantes> modifyEstudiantes(String id, Estudiantes estudiante);

	Mono<Void> deleteById(String id);

	Mono<Estudiantes> findbyId(String id);

	Flux<Estudiantes> getAll();
}

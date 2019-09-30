package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Estudiantes;
import com.main.repository.EstudiantesRepository;
import com.main.service.EstudiantesService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {

	@Autowired
	private EstudiantesRepository repo;
	
	

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

	@Override
	public Mono<Estudiantes> findbyId(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Flux<Estudiantes> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Mono<Estudiantes> createEstudiantes(Estudiantes estudiante) {
		// TODO Auto-generated method stub
		return repo.save(estudiante);
	}

	@Override
	public Mono<Estudiantes> modifyEstudiantes(String id, Estudiantes estudiante) {
		// TODO Auto-generated method stub
		estudiante.setId(id);
		return repo.save(estudiante);
	}

}

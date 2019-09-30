package com.main.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Estudiantes;
import com.main.serviceImpl.EstudiantesServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/API/Estudiantes")
public class EstudiantesController {

	@Autowired
	private EstudiantesServiceImpl service;

	@GetMapping
	public Flux<Estudiantes> Getall() {
		return service.getAll();}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Estudiantes> createEstudiantes(@RequestBody Estudiantes estudiantes) {
		return service.createEstudiantes(estudiantes);
	}

	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Estudiantes> updateEstudiante(@PathVariable String id, @RequestBody Estudiantes estudiantes) {
		return service.modifyEstudiantes(id, estudiantes);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteestudiante(@PathVariable String id) {
		return service.deleteById(id);
	}
}

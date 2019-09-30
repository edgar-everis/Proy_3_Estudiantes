package com.main.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Document(collection = "Estudiantes")
public class Estudiantes {
	
	private String id;
	
	private String nombre;
	
	private String tipo;
	
	private String documento;

}

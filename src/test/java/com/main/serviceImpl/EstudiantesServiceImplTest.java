package com.main.serviceImpl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.main.repository.EstudiantesRepository;


@RunWith(SpringRunner.class)
@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EstudiantesServiceImplTest {

	    @Mock
	    private EstudiantesRepository repo;
	    
	    @InjectMocks
	    private EstudiantesServiceImpl service;
	
	@Test
	public void testDeleteById() {
		
	}

	@Test
	public void testFindbyId() {
		
	}

	@Test
	public void testGetAll() {
		
	}

	@Test
	public void testCreateEstudiantes() {
		
	}

	@Test
	public void testModifyEstudiantes() {
		
	}

}

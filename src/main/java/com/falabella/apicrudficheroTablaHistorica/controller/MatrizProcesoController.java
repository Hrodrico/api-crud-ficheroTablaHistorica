package com.falabella.apicrudficheroTablaHistorica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;
import com.falabella.apicrudficheroTablaHistorica.service.MatrizProcesoService;

@CrossOrigin(origins = "*") 
@RestController
public class MatrizProcesoController {

	@Autowired
	MatrizProcesoService service;
	
	@GetMapping(value="matrizProcesoHistoria",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<MatrizProcesoHistoria> recuperarContactos() {
		System.out.println("entra");
		return service.recuperarMatriz();
	}
	
}

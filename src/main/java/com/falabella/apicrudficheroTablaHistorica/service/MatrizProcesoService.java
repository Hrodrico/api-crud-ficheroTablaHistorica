package com.falabella.apicrudficheroTablaHistorica.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;


@Component
public interface MatrizProcesoService {
	
	List<MatrizProcesoHistoria> recuperarMatriz();

}

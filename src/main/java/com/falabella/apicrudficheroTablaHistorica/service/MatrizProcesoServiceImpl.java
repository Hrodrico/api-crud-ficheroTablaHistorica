package com.falabella.apicrudficheroTablaHistorica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.apicrudficheroTablaHistorica.Dao.MatrizProcesoDao;
import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;

import java.util.List;


@Service
public class MatrizProcesoServiceImpl implements MatrizProcesoService{
	
	@Autowired
	MatrizProcesoDao dao;
	
	@Override
	public List<MatrizProcesoHistoria> recuperarMatriz() {
		System.out.println("entra a service Impl");
//		return new ArrayList<MatrizProcesoHistoria>();
		
		return dao.devolverMatrizProcesoHistoria();
//		return matriz.findAll();
	}

}

package com.falabella.apicrudficheroTablaHistorica.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;

@Repository
public class MatrizProcesoDaoImpl implements MatrizProcesoDao {
	
	@Autowired
	MatrizProcesoJpaSpring matriz;
	
	@Override
	public List<MatrizProcesoHistoria> devolverMatrizProcesoHistoria() {
		return matriz.findAll();
	}
	
	
//	@Override
//	public MatrizProcesoHistoria recuperarMatrizProceso(String fecha) {	
//		return matriz.findByFecha(fecha);
//	}
	
//	@Override
//	public void eliminarMatriz(String fecha) {
//		matriz.eliminarMatrizProcesoPorFecha(fecha);
//	}

	

}

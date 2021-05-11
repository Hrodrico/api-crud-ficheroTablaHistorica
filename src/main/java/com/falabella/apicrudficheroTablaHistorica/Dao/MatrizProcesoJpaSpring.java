package com.falabella.apicrudficheroTablaHistorica.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;


public interface MatrizProcesoJpaSpring extends JpaRepository<MatrizProcesoHistoria, Integer>{
	
//	MatrizProcesoHistoria findByFecha(String fecha);
	
//	@Transactional
//	@Modifying
//	@Query("Delete from matriz_proceso_historia m where m.fecha_creacion=?1")
//	void eliminarMatrizProcesoPorFecha(String fecha);

		
}

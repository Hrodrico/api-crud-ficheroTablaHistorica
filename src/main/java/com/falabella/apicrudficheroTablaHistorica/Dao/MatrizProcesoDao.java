package com.falabella.apicrudficheroTablaHistorica.Dao;
import com.falabella.apicrudficheroTablaHistorica.model.MatrizProcesoHistoria;

import java.util.List;




public interface MatrizProcesoDao {
	
	List<MatrizProcesoHistoria> devolverMatrizProcesoHistoria();
	
//	MatrizProcesoHistoria recuperarMatrizProceso(String fecha);
	
//	void eliminarMatriz(String fecha);

}

package com.falabella.apicrudficheroTablaHistorica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the matriz_proceso_historia database table.
 * 
 */
@Entity
@Table(name="matriz_proceso_historia")
@NamedQuery(name="MatrizProcesoHistoria.findAll", query="SELECT m FROM MatrizProcesoHistoria m")
public class MatrizProcesoHistoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="archivo_contenido")
	private String archivoContenido;

	@Column(name="archivo_nombre")
	private String archivoNombre;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	public MatrizProcesoHistoria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArchivoContenido() {
		return this.archivoContenido;
	}

	public void setArchivoContenido(String archivoContenido) {
		this.archivoContenido = archivoContenido;
	}

	public String getArchivoNombre() {
		return this.archivoNombre;
	}

	public void setArchivoNombre(String archivoNombre) {
		this.archivoNombre = archivoNombre;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
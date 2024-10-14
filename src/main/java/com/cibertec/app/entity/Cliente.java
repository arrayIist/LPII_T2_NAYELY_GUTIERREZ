package com.cibertec.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idclie")
	private int idClie;
	
	@Column(name="razon_soc")
	private String razonSoc;
	
	@Column(name="nombre_ciudad")
	private String nombreCiudad;
	
	@Column(name="direccion_clie")
	private String direccionClie;
	
	@Column(name="telefono")
	private String telefono;

	public Cliente() {
	}

	public int getIdClie() {
		return idClie;
	}
	public void setIdClie(int idClie) {
		this.idClie = idClie;
	}
	public String getRazonSoc() {
		return razonSoc;
	}
	public void setRazonSoc(String razonSoc) {
		this.razonSoc = razonSoc;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getDireccionClie() {
		return direccionClie;
	}
	public void setDireccionClie(String direccionClie) {
		this.direccionClie = direccionClie;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}

package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Persona")
public class Persona implements Serializable {

	public Persona(String per_cedula, String per_apellido, String per_correo, String per_direccion, String per_telefono,
			String per_sexo) {
		super();
		this.per_cedula = per_cedula;
		this.per_apellido = per_apellido;
		this.per_correo = per_correo;
		this.per_direccion = per_direccion;
		this.per_telefono = per_telefono;
		this.per_sexo = per_sexo;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long per_id;
	/**
	 * 
	 */
	@Column(unique = true)
	private String per_cedula;
	/**
	 * 
	 */
	private String per_apellido, per_correo, per_direccion, per_telefono, per_sexo;
	/**
	 * 
	 */
	public Long getPer_id() {
		return per_id;
	}
	public void setPer_id(Long per_id) {
		this.per_id = per_id;
	}
	public String getPer_cedula() {
		return per_cedula;
	}
	public void setPer_cedula(String per_cedula) {
		this.per_cedula = per_cedula;
	}
	public String getPer_apellido() {
		return per_apellido;
	}
	public void setPer_apellido(String per_apellido) {
		this.per_apellido = per_apellido;
	}
	public String getPer_correo() {
		return per_correo;
	}
	public void setPer_correo(String per_correo) {
		this.per_correo = per_correo;
	}
	public String getPer_direccion() {
		return per_direccion;
	}
	public void setPer_direccion(String per_direccion) {
		this.per_direccion = per_direccion;
	}
	public String getPer_telefono() {
		return per_telefono;
	}
	public void setPer_telefono(String per_telefono) {
		this.per_telefono = per_telefono;
	}
	public String getPer_sexo() {
		return per_sexo;
	}
	public void setPer_sexo(String per_sexo) {
		this.per_sexo = per_sexo;
	}
	
	

}

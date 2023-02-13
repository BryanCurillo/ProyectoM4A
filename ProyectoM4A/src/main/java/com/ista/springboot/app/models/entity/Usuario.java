package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Usuario")
public class Usuario implements Serializable{

	public Usuario(Persona usu_perCedula, Long usu_idRol, String usu_nombreUsuario, String contrasena,
			double usu_calificacion) {
		super();
		this.usu_perCedula = usu_perCedula;
		this.usu_idRol = usu_idRol;
		this.usu_nombreUsuario = usu_nombreUsuario;
		this.contrasena = contrasena;
		this.usu_calificacion = usu_calificacion;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usu_id;
	/**
	 * 
	 */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usu_perCedula", referencedColumnName = "per_cedula")
	private Persona usu_perCedula;
	private Long usu_idRol;
	/**
	 * 
	 */
	@Column(unique = true)
	private String usu_nombreUsuario, contrasena;
	private double usu_calificacion;
	/**
	 * 
	 */
	public Long getUsu_id() {
		return usu_id;
	}
	public void setUsu_id(Long usu_id) {
		this.usu_id = usu_id;
	}
	public Persona getUsu_perCedula() {
		return usu_perCedula;
	}
	public void setUsu_perCedula(Persona usu_perCedula) {
		this.usu_perCedula = usu_perCedula;
	}
	public Long getUsu_idRol() {
		return usu_idRol;
	}
	public void setUsu_idRol(Long usu_idRol) {
		this.usu_idRol = usu_idRol;
	}
	public String getUsu_nombreUsuario() {
		return usu_nombreUsuario;
	}
	public void setUsu_nombreUsuario(String usu_nombreUsuario) {
		this.usu_nombreUsuario = usu_nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public double getUsu_calificacion() {
		return usu_calificacion;
	}
	public void setUsu_calificacion(double usu_calificacion) {
		this.usu_calificacion = usu_calificacion;
	}
	
	
	

}

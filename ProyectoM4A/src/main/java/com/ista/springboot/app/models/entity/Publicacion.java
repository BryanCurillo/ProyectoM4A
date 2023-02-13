package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Publicacion")
public class Publicacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pub_id;
	/**
	 * 
	 */
	private Long pub_idVendedor;
	private Long pub_idProducto;
	private String pub_descripcion;
	/**
	 * 
	 */
	public Long getPub_id() {
		return pub_id;
	}
	public void setPub_id(Long pub_id) {
		this.pub_id = pub_id;
	}
	public Long getPub_idVendedor() {
		return pub_idVendedor;
	}
	public void setPub_idVendedor(Long pub_idVendedor) {
		this.pub_idVendedor = pub_idVendedor;
	}
	public Long getPub_idProducto() {
		return pub_idProducto;
	}
	public void setPub_idProducto(Long pub_idProducto) {
		this.pub_idProducto = pub_idProducto;
	}
	public String getPub_descripcion() {
		return pub_descripcion;
	}
	public void setPub_descripcion(String pub_descripcion) {
		this.pub_descripcion = pub_descripcion;
	}
	
	
}

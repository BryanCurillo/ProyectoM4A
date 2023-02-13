package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProductoOferta")
public class ProductoOferta implements Serializable{
	
	public ProductoOferta(Categoria of_idCategoria, String of_nombre, Double of_precio, Byte of_foto,
			String of_descripcion) {
		super();
		this.of_idCategoria = of_idCategoria;
		this.of_nombre = of_nombre;
		this.of_precio = of_precio;
		this.of_foto = of_foto;
		this.of_descripcion = of_descripcion;
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
	private Long po_id;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "of_idCategoria", referencedColumnName = "cat_id")
	private Categoria of_idCategoria;
	/**
	 * 
	 */
	private String of_nombre;
	private Double of_precio;
	private Byte of_foto;
	private String of_descripcion;
	/**
	 * 
	 */
	public Long getPo_id() {
		return po_id;
	}
	public void setPo_id(Long po_id) {
		this.po_id = po_id;
	}
	public Categoria getOf_idCategoria() {
		return of_idCategoria;
	}
	public void setOf_idCategoria(Categoria of_idCategoria) {
		this.of_idCategoria = of_idCategoria;
	}
	public String getOf_nombre() {
		return of_nombre;
	}
	public void setOf_nombre(String of_nombre) {
		this.of_nombre = of_nombre;
	}
	public Double getOf_precio() {
		return of_precio;
	}
	public void setOf_precio(Double of_precio) {
		this.of_precio = of_precio;
	}
	public Byte getOf_foto() {
		return of_foto;
	}
	public void setOf_foto(Byte of_foto) {
		this.of_foto = of_foto;
	}
	public String getOf_descripcion() {
		return of_descripcion;
	}
	public void setOf_descripcion(String of_descripcion) {
		this.of_descripcion = of_descripcion;
	}
}

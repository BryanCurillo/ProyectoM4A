package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Producto")
public class Producto implements Serializable{
	
	public Producto(String prod_nombre, Double precio, String prod_descripcion, Byte prod_foto) {
		super();
		this.prod_nombre = prod_nombre;
		this.precio = precio;
		this.prod_descripcion = prod_descripcion;
		this.prod_foto = prod_foto;
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
	private Long prod_id;
	/**
	 * 
	 */
	private String prod_nombre;
	private Double precio;
	private String prod_descripcion;
	private Byte prod_foto;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_id")
	private List<Categoria> prod_idCategoria;
	/**
	 * 
	 */
	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_nombre() {
		return prod_nombre;
	}

	public void setProd_nombre(String prod_nombre) {
		this.prod_nombre = prod_nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getProd_descripcion() {
		return prod_descripcion;
	}

	public void setProd_descripcion(String prod_descripcion) {
		this.prod_descripcion = prod_descripcion;
	}

	public Byte getProd_foto() {
		return prod_foto;
	}

	public void setProd_foto(Byte prod_foto) {
		this.prod_foto = prod_foto;
	}
}

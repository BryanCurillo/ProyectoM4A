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
@Table(name = "Trueque")
public class Trueque implements Serializable {
	
	public Trueque(Usuario tru_idVendedor, Producto tru_idProducto, Long tru_comprador) {
		super();
		this.tru_idVendedor = tru_idVendedor;
		this.tru_idProducto = tru_idProducto;
		this.tru_comprador = tru_comprador;
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
	private Long tru_numero;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tru_idVendedor", referencedColumnName = "usu_id")
	private Usuario tru_idVendedor;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tru_idProducto", referencedColumnName = "prod_id")
	private Producto tru_idProducto;
	/**
	 * 
	 */
	private Long tru_comprador;
	/**
	 * 
	 */
	public Long getTru_numero() {
		return tru_numero;
	}
	public void setTru_numero(Long tru_numero) {
		this.tru_numero = tru_numero;
	}
	public Usuario getTru_idVendedor() {
		return tru_idVendedor;
	}
	public void setTru_idVendedor(Usuario tru_idVendedor) {
		this.tru_idVendedor = tru_idVendedor;
	}
	public Producto getTru_idProducto() {
		return tru_idProducto;
	}
	public void setTru_idProducto(Producto tru_idProducto) {
		this.tru_idProducto = tru_idProducto;
	}
	public Long getTru_comprador() {
		return tru_comprador;
	}
	public void setTru_comprador(Long tru_comprador) {
		this.tru_comprador = tru_comprador;
	}
	
}

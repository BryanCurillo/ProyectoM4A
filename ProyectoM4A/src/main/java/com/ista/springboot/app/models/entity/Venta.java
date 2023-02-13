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
@Table(name = "Venta")
public class Venta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ven_id;
	private String ven_metodoPago;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ven_idProducto", referencedColumnName = "prod_id")
	private Producto ven_idProducto;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ven_idComprador", referencedColumnName = "usu_id")
	private Usuario ven_idComprador;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ven_idVendedor", referencedColumnName = "usu_id")
	private Usuario ven_idVendedor;
	/**
	 * 
	 */
	public Long getVen_id() {
		return ven_id;
	}
	public void setVen_id(Long ven_id) {
		this.ven_id = ven_id;
	}
	public String getVen_metodoPago() {
		return ven_metodoPago;
	}
	public void setVen_metodoPago(String ven_metodoPago) {
		this.ven_metodoPago = ven_metodoPago;
	}
	public Producto getVen_idProducto() {
		return ven_idProducto;
	}
	public void setVen_idProducto(Producto ven_idProducto) {
		this.ven_idProducto = ven_idProducto;
	}
	public Usuario getVen_idComprador() {
		return ven_idComprador;
	}
	public void setVen_idComprador(Usuario ven_idComprador) {
		this.ven_idComprador = ven_idComprador;
	}
	public Usuario getVen_idVendedor() {
		return ven_idVendedor;
	}
	public void setVen_idVendedor(Usuario ven_idVendedor) {
		this.ven_idVendedor = ven_idVendedor;
	}
}

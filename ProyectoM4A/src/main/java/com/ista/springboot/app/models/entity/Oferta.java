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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Oferta")
public class Oferta implements Serializable{
	
	public Oferta(List<Trueque> ofe_idTrueque, Producto ofe_idProducto, Boolean estado) {
		super();
		this.ofe_idTrueque = ofe_idTrueque;
		this.ofe_idProducto = ofe_idProducto;
		this.estado = estado;
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
	private Long ofe_id;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tru_numero")
	private List<Trueque> ofe_idTrueque;
	/***
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ofe_idProducto", referencedColumnName = "prod_id")
	private Producto ofe_idProducto;
	
	private Boolean estado;
	/**
	 * 
	 */
	public Long getOfe_id() {
		return ofe_id;
	}

	public void setOfe_id(Long ofe_id) {
		this.ofe_id = ofe_id;
	}

	public List<Trueque> getOfe_idTrueque() {
		return ofe_idTrueque;
	}

	public void setOfe_idTrueque(List<Trueque> ofe_idTrueque) {
		this.ofe_idTrueque = ofe_idTrueque;
	}

	public Producto getOfe_idProducto() {
		return ofe_idProducto;
	}

	public void setOfe_idProducto(Producto ofe_idProducto) {
		this.ofe_idProducto = ofe_idProducto;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}

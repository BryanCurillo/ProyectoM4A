package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EncabezadoFactura")
public class EncabezadoFactura implements Serializable{
	
	
	public EncabezadoFactura(Persona enca_cedulaCliente, Date enca_fecha) {
		super();
		this.enca_cedulaCliente = enca_cedulaCliente;
		this.enca_fecha = enca_fecha;
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
	private Long enca_numero;
	/**
	 * 
	 */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enca_cedulaCliente", referencedColumnName = "per_cedula")
    private Persona enca_cedulaCliente;
    /**
     * 
     */
    private Date enca_fecha;
    /**
     * 
     */
	public Long getEnca_numero() {
		return enca_numero;
	}
	public void setEnca_numero(Long enca_numero) {
		this.enca_numero = enca_numero;
	}
	public Persona getEnca_cedulaCliente() {
		return enca_cedulaCliente;
	}
	public void setEnca_cedulaCliente(Persona enca_cedulaCliente) {
		this.enca_cedulaCliente = enca_cedulaCliente;
	}
	public Date getEnca_fecha() {
		return enca_fecha;
	}
	public void setEnca_fecha(Date enca_fecha) {
		this.enca_fecha = enca_fecha;
	}

}

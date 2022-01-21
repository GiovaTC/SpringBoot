package com.tiburcio.catalogo.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Catalogo implements Serializable{
   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private long id;
	
	
	private String unidad;
	
	
	private double precio;
	

	private String etiqueta;
	
	private String descripcion;
	
	private int cantidad;
	
	private double valorcot;
    
	



	


	public double getValorcot() {
		return valorcot;
	}



	public void setValorcot(double valorcot) {
		valorcot = valorcot;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUnidad() {
		return unidad;
	}



	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getEtiqueta() {
		return etiqueta;
	}



	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
        

	public Catalogo(String unidad,double precio,String etiqueta, String descripcion, int cantidad, double valorcot) {
		super();
		this.unidad = unidad;
		this.precio = precio;
		this.etiqueta = etiqueta;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.valorcot = valorcot; 
	
		
	}



	public Catalogo() {
		super();
	}
	
	
}

package com.apirest.app.Evento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//------------------------------Creación del modelo de la entidad (restaurante)------------------


@Data  //Lombok annotation, create getters, setters, hash, etc...
@Entity // This tells Hibernate to make a table out of this class
public class Evento {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String nombre;
	private String fecha;
	private String descripcion;
	private String url_img;
	private long id_ubicaciones; //many to one
	
	public Evento(){
		nombre = "";
		descripcion = "";
		fecha = "";
		url_img = "";
		id_ubicaciones = 1;
	}
	
	Evento(String nombre, String fecha, String descripcion, String url_img, long id_ubicaciones){
		this.nombre = nombre;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.url_img = url_img;
		this.id_ubicaciones = id_ubicaciones;
	}
	
}
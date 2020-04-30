package com.apirest.app.Alojamiento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//------------------------------Creación del modelo de la entidad (restaurante)------------------


@Data  //Lombok annotation, create getters, setters, hash, etc...
@Entity // This tells Hibernate to make a table out of this class
public class Alojamiento {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String nombre;
	private String descripcion;
	private String telefono;
	private String url_img;
	private String url_alojamiento;
	private long id_ubicaciones; //many to one
	
	public Alojamiento(){
		nombre = "";
		descripcion = "";
		telefono = "";
		url_img = "";
		url_alojamiento = "";
		id_ubicaciones = 1;
	}
	
	Alojamiento(String nombre, String descripcion, String telefono, String url_img, String url_alojamiento, long id_ubicaciones){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.url_img = url_img;
		this.url_alojamiento = url_alojamiento;
		this.id_ubicaciones = id_ubicaciones;
	}
	
}

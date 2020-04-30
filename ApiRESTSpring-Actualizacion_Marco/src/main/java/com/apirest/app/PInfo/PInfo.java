package com.apirest.app.PInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//------------------------------Creación del modelo de la entidad (restaurante)------------------


@Data  //Lombok annotation, create getters, setters, hash, etc...
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "p_info")
public class PInfo {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String nombre;
	private String descripcion;
	private String url_img;
	private long id_ubicaciones; //many to one
	
	public PInfo(){
		nombre = "";
		descripcion = "";
		url_img = "";
		id_ubicaciones = 1;
	}
	
	PInfo(String nombre, String descripcion, String url_img, long id_ubicaciones){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url_img = url_img;
		this.id_ubicaciones = id_ubicaciones;
	}
	
}
package com.apirest.app.Alojamiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//----------------------------Controlador para manejar peticiones HTTP--------------------------

@Controller // This means that this class is a Controller
@RequestMapping(path="/alojamiento") // This means URL's start with /Alojamientos (after Application path)
public class AlojamientoController {
	  @Autowired // This means to get the bean called AlojamientosRepository
      // Which is auto-generated by Spring, we will use it to handle the data
	  public AlojamientoRepository AlojamientoRepository;
	  
	  // CODIGO PARA PETICIONES POST
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewAlojamiento (
			  @RequestParam String nombre,
			  @RequestParam String descripcion,
			  @RequestParam String telefono,
			  @RequestParam String url_img,
			  @RequestParam String url_tri,
			  @RequestParam Long id_ubicaciones
			  ) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		  
		 Alojamiento n = new Alojamiento();
		  n.setNombre(nombre);
		  n.setDescripcion(descripcion);
		  n.setTelefono(telefono);
		  n.setUrl_img(url_img);
		  n.setUrl_alojamiento(url_tri);
		  n.setId_ubicaciones(id_ubicaciones);
		  AlojamientoRepository.save(n);
		  return "Guardado";
	  } 
	  
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Alojamiento> getAllAlojamientos() {
		  //This returns a JSON or XML with the Alojamientos
		  return AlojamientoRepository.findAll();
	  }
	  
	  //Ejemplos para POST y GET. Por defecto RequestMapping mapea todas las operaciones HTTP
}

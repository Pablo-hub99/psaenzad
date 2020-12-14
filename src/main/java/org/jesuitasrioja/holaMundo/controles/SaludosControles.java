package org.jesuitasrioja.holaMundo.controles;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosControles {
	
	//@GetMapping("/saludos/{nombre}")
	//public String getSaludo(@PathVariable String nombre) {
		//return "hola"+nombre;
//	}
	@GetMapping("/saludos/{nombre}")
	public String getSaludo(@RequestParam String nombre) {
		return "hola"+nombre;
	}
	@PostMapping("/saludos")
	public String postSaludos() {
		return "hola mundo con post";
	}
	
	@DeleteMapping
	public String deleteSaludos() {
		return "hola mundo con delete";
	}
	
	

}

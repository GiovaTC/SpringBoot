package com.tiburcio.catalogo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tiburcio.catalogo.entity.models.Catalogo;
import com.tiburcio.catalogo.entity.services.ICatalogoService;

@Controller
@RestController

public class CatalogoController {
	
	@Autowired
	ICatalogoService catalogoService;
    
	@GetMapping("/catalogo")
	public List<Catalogo> getAllCatalogo(){
		return catalogoService.getAll();
	}
	
	@GetMapping("/catalogo/{id}")
	public Catalogo getOne(@PathVariable(value = "id") long id) {
		return catalogoService.get(id);
	}
	
	@PostMapping("/catalogo")
	public void add(Catalogo catalogo) {
		catalogoService.post(catalogo);
	}
	
	@PutMapping("/catalogo/{id}")
	public void update(Catalogo catalogo, @PathVariable(value = "id") long id ) {
		catalogoService.put(catalogo, id);
	}
	
	@DeleteMapping("/catalogo/{id}")
	public void update(@PathVariable(value = "id") long id) {
		catalogoService.delete(id);
	}
	
	
}

package com.tiburcio.catalogo.entity.services;

import java.util.List;

import com.tiburcio.catalogo.entity.models.Catalogo;

public interface ICatalogoService {

	public Catalogo get(long id); 
	public  List<Catalogo> getAll();
	public void post(Catalogo catalogo);
	public  void put(Catalogo catalogo, long id);
	public void delete(long id);
}

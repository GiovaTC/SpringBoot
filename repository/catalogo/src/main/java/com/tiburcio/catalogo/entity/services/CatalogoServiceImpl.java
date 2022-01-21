package com.tiburcio.catalogo.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.catalogo.dao.ICatalogoDao;
import com.tiburcio.catalogo.entity.models.Catalogo;

@Service
public class CatalogoServiceImpl implements ICatalogoService{

	@Autowired
	private ICatalogoDao catalogoDao;
	
	@Override
	public Catalogo get(long id) {
		
		return catalogoDao.findById(id).get();
	}

	@Override
	public List<Catalogo> getAll() {
		
		return (List<Catalogo>)catalogoDao.findAll();
	}

	@Override
	public void post(Catalogo catalogo) {
		catalogoDao.save(catalogo);
		
	}

	@Override
	public void put(Catalogo catalogo, long id) {
		catalogoDao.findById(id).ifPresent((x)->{
			catalogo.setId(id);
			catalogoDao.save(catalogo);
		});
		
	}

	@Override
	public void delete(long id) {
		catalogoDao.deleteById(id);
		
	}
	

}

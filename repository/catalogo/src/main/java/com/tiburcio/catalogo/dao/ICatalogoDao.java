package com.tiburcio.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.catalogo.entity.models.Catalogo;

public interface ICatalogoDao extends CrudRepository <Catalogo, Long> {

	
}

package com.oscar.cursomc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.cursomc.domain.Categoria;
import com.oscar.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
       return obj.orElse(null);
	}
	

}

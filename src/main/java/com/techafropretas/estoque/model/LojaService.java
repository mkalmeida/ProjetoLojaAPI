package com.techafropretas.estoque.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LojaService {
	
	private final LojaRepository lojaRepository;
	
	@Autowired
	public LojaService(LojaRepository lojaRepository) {
		this.lojaRepository = lojaRepository;
	}

	public List<Loja> getLojas() {
		return lojaRepository.findAll();
				
	}
	

	public Object addNewStudent(Loja loja) {
		return loja;
		}
	}



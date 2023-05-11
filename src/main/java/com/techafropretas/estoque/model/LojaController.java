package com.techafropretas.estoque.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class LojaController {
	
	private final LojaService lojaService;
	
	@Autowired
	public LojaController(LojaService lojaService) {
		this.lojaService = lojaService;
	}

	@GetMapping("/")
	public List<Loja> getLojas() {
		return lojaService.getLojas();
	}
	
	@PostMapping("/post")
	public Object registerNewLoja(@RequestBody Loja loja) {
		return lojaService.addNewStudent(loja);
	}
}

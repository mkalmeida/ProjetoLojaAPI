package com.techafropretas.estoque.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer>{

	/*procurar loja por email - SELECT * FROM loja WHERE email = ?*/
	Optional<Loja> findLojaByEmail(String email);
	
}

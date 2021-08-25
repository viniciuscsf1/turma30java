package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	/* ENTENDENDO O NOME DESSE MÉTODO:
	- FIND ALL SERIA BUSCA TODOS PELO TITULO
	- CONTAINING SERIA A MESMA COISA DO LIKE NO SQL
	- O IGNORE CASE É UTILIZADO PRA NÃO LEVAR EM CONSIDERAÇÃO LETRAS MAISCULAS OU MINUSCULAS, 
	OU SEJA:
	 BUSCA PELO TITULO, TRAS TODO MUNDO QUE TEM ESSE TITULO MAS NAO O TITULO EXATO, O QUE CONTEM
	 DENTRO DELE SEM LEVAR EM CONSIDERAÇÃO MAISCULO E MINUSCULO  */
}


	


package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //ESSA ANOTAÇÃO INFORMA AO SPRING QUE ESSA CLASSE SE TRATA DE UM CONTROLADOR
@RequestMapping ("/postagens") // INFORMA QUAL A URL, QUANDO ALGUEM REQUISITAR O /POSTAGENS, ESSA REQUISIÇÃO
							   //PASSARA A CONSUMIR ESSA CLASSE
@CrossOrigin("*") //ISSO INFORMA Q ESSA CLASSE VAI ACEITAR REQUISIÇÕES DE QUALQUER ORIGEM

public class PostagemController {
	
	@Autowired  
	private PostagemRepository repository;

/*ISSO SEM O @Autowired NÃO FUNCIONA POIS COMO ISSO AQUI É UMA INTERFACE NÓS NAO CONSEGUIMOS INSTACIÁ-LA, 
 * LOGO PRECISAMOS UTILIZAR ESSA ANOTAÇÃO PARA DEIXAR TODA A RESPONSABILIDADE DE INSTANCIAÇÃO DESSA INTERFACE
 * PARA O SPRING. PARA ISSO UTILIZAMOS O @Autowired */
	
	//-------------------------------------------- FIND ALL POSTAGENS ---------------------------------------------------
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
/* ESSE MÉTODO N FUNCIONA SEM O @GetMapping, ISSO PORQUE NÓS PRECISAMOS EXPOR PARA A API Q ESSE MÉTODO SE TRATA
 *  DE UM GET. ESTOU DIZENDO QUE SE ALGUEM FIZER UMA REQUISIÇÃO EXTERNA POR MEIO DA URI /postagens E ESSA 
 *  REQUISIÇÃO FOR UM METODO GET, ELE VAI DISPARAR ESTE MÉTODO.
    O FIND ALL É O METODO DENTRO DA NOSSA API QUE VAI RETORNAR UMA LISTA DE POSTAGENS
    
    ------------------------------------------ FIND BY ID -----------------------------------------------*/
	
	@GetMapping("/{id}")
    public ResponseEntity<Postagem> GetAll(@PathVariable long id) {  // LONG POIS O ID FOI DECLARADO ASSIM LA NA MODEL
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }
	
	//---------------------------------------- GET BY TITULO -----------------------------------------------
	
	@GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo) {
        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    }
	
	//-------------------------------------------- POST ---------------------------------------------------
	
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem)); 
	}//CORPO DA REQUISICAO : .body(repository.save(postagem))
	// PARA RECEPCIONAR OS VALORES/OBJETOS QUE SÃO PASSADAS VIA BODY PARA NOSSA APLICAÇÃO, DEVES-E UTILIZAR A 
	//ANOTAÇÃO @RequestBody
	
	
	//-------------------------------------------- PUT ---------------------------------------------------
	
	@PutMapping  //METODO BEM PARECIDO COM O POST
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	} //ESSE .status(HttpStatus.OK) É EQUIVALENTE AO .ok 
	
	
	//-------------------------------------------- DELETE ---------------------------------------------------
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}

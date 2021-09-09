package org.generation.blogPessoal.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)	//informando que se trata de uma classe de teste
public class UsuarioTest {
    
    public Usuario usuario;
    public Usuario usuarioErro = new Usuario();

	@Autowired
	private  ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	// Esse objeto injetado captura todas as mensagens de erro de validação (constraints)
	
	
	Validator validator = factory.getValidator();

	@BeforeEach				//Iniciar o objeto da classe usuario antes de iniciar o teste
	public void start() {

		LocalDate data = LocalDate.parse("2000-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		usuario = new Usuario(0L, "João da Silva", "joao@email.com.br", "13465278");

	}

	@Test
	@DisplayName("✔ Valida Atributos Não Nulos")
	void testValidaAtributos() {

		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario);
		//Set é um tipo de lista que não aceita repetições
		//é nessa collection que são armazenadas as mensagens de erro
		
		System.out.println(violacao.toString());

		assertTrue(violacao.isEmpty());		//verificando se a a collections Violation está vazia
		//assert True verifica se uma condição é verdadeira
	}
    
    @Test
	@DisplayName("✖ Não Valida Atributos Nulos")
	void  testNaoValidaAtributos() {

		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuarioErro);
		System.out.println(violacao.toString());

		assertTrue(violacao.isEmpty());
	}

}
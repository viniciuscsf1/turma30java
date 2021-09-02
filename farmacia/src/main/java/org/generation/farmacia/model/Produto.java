package org.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity          // PRIMEIRO PRECISO DECLARAR QUE ESSA MODEL SE TRATA DE UMA ENTIDADE
@Table (name = "tb_produto")		//DEPOIS PASSAR O NOME DA TABELA
public class Produto {
	
	@Id 		// CRIANDO O ID DOS PRODUTOS
	@GeneratedValue (strategy = GenerationType.IDENTITY)		//PASSAR O AUTOINCREMENT PARA O ID
	private long id;
	
	@NotBlank		//NAO ACEITAR VALORES EM BRANCO
	@Size (max = 150)		//TAMANHO MAXIMO DOS NOMES
	private String nome;
	
	@NotNull
	@Min(0)			//VALOR MÍNIMO ACEITAVEL
	private BigDecimal preco;
	
	@NotNull
	@Max(1000)
	private int estoque;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
				//GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

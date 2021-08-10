package entidades;

public class Produto {

// ATRIBUTOS DA CLASSE PRODUTO (PRIMEIRA COISA QUE SE FAZ NUMA CLASSE � DAR UM NOME A ELA)
// O QUE ESSA CLASSE "PRODUTO" �, TEM OU ESTA ?
// PRIVATE PARA TER SEGURAN�A (NA HORA DE FAZER O CONSTRUTOR, ELE IDENTIFICA COM CORES O PRIVATE, PUBLIC E SECURITY)
// PRIVATE PQ N QUEREMOS QUE ELE SEJA VISTO EM OUTROS PROGRAMAS
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	// O CONTRUTOR OBRIGA O PROGRAMA A ACEITAR A CLASSE UNICAMENTE COM OS ATRIBUTOS Q VC PROGRAMOU
	//CONSTRUTOR (O UNICO M�TODO QUE TEM O MESMO NOME DA CLASSE � O CONSTRUTOR)
	// � POSSIVEL TER MAIS DE UM CONSTRUTOR
	// O CONSTRUTOR � PUBLICO PQ VC VAI USAR ISSO AQUI NO OUTRO C�DIGO DO OUTRO LADO
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		//O THIS SERVE PRA TIRAR A AMBIGUIDADE
		// COM O THIS VC FALA Q ESSA VARIAVEL CODIGO RECEBE
		this.nome = nome;
	}
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	// ENCAPSULAMENTO - METODO
	// O GET FAZ "O QUE Q TEM AQUI NO PROGRAMA ? VAI LA E ME MOSTRA" O GET PEGA E O RETURN MOSTRA
	// O SET SERVE PRA MEXER
	//get = chamar o que est� registrado no atributo
	//set = alterar o que est� registrado no atributo
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	//METODOS
	public void incluiEstoque(int quantidade) {
			this.estoque = this.estoque + quantidade;

	}
	
	public void retiraEstoque(int quantidade) {
		if (quantidade >estoque) {
			System.out.println("Quantidade indispon�vel");
		}
		else {
			this.estoque = this.estoque - quantidade;
		}
	}
}

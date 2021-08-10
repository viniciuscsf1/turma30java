package programas;

import entidades.Produto;

public class CadLoja {
	
	public static void main (String[]args) {
		
		Produto prod1 = new Produto("001","CAMISA");
		Produto prod2 = new Produto("002", "CALÇA", 100.50, 10);
		
		prod1.setNome("CAMISETA");
		prod1.incluiEstoque(10);
		prod2.setValor(100);
		prod2.retiraEstoque(5);
		System.out.println(prod1.getNome()+" qtde "+ prod1.getEstoque());
		System.out.println(prod2.getValor()*2);
		System.out.println(prod2.getEstoque());
	}

}

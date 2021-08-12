package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioLista {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		List<String> controleEstoque = new ArrayList();
		int x = 0;
		String nome;
		controleEstoque.add("CERVEJA");
		controleEstoque.add("REFRIGERANTE");
		controleEstoque.add("ENERGETICO");
		controleEstoque.add("SUCO");
		controleEstoque.add("AGUA");
		
		System.out.println("Itens em estoque "+ controleEstoque.size());
		
		controleEstoque.add(3,"CACHAÇA");
			
		for (String estoque : controleEstoque) {
			System.out.println(x+" - "+ estoque);
			x++;
		}
		
		System.out.println("Digite o nome do item que deseja apagar :");
		nome = leia.next().toUpperCase();
		x = controleEstoque.indexOf(nome);
		System.out.println("Vc escolheu o item "+controleEstoque.get(x)+", este item será retirado do estoque!!!");
		controleEstoque.remove(x);
		
		System.out.println("Novo Estoque\n");
	
		for (String estoque : controleEstoque) {
			System.out.println(controleEstoque.indexOf(estoque)+" - "+ estoque);
		}
		
		
		
	}

}

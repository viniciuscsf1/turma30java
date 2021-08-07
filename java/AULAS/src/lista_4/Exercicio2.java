package lista_4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		System.out.println("Preencha a ficha técnica do avião");
		System.out.println("Digite o nome: ");
		aviao1.nome = leia.next();
		System.out.println("Digite o tipo(Executivo, militar ou comercial: ");
		aviao1.tipo = leia.next();
		System.out.println("Digite o comprimento (em metros): ");
		aviao1.comprimento = leia.nextInt();
		System.out.println("Digite a capacidade de carga (em kg): ");
		aviao1.capacidadeCarga = leia.nextInt();
		System.out.println("Digite a altitude máxima de voo (em m): ");
		aviao1.altitudeVoo = leia.nextInt();
		System.out.println("Digite a velocidade máxima (em km/h: ");
		aviao1.velocidadeMaxima = leia.nextInt();
		
		aviao1.av1();

		
	}

}

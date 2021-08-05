package Lista3;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, contador = 0;
		double media = 0.0;
		System.out.println("Para sair do programa, digite 0!");
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero%3==0 && numero != 0) {
				contador ++;
				media += numero;
			}
		}while(numero!=0);
		System.out.printf("A média dos números multiplos de 3 é: %.3f", media/contador);

	}

}

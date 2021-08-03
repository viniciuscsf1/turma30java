package Lista2;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		double num = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextDouble();
		
		if (num <= 0) {
			System.out.println("O número digitado é invalido!"+
		"Escolha um número que seja positivo e maior que 0!!");
		}
		else if (num%2 == 0) {
			System.out.printf("O número é par e sua raíz é: %.3f",Math.sqrt(num));
		}
		else {
			System.out.println(" O número é impar e seu quadrado é: "+Math.pow(num, 2));
		}

	}

}

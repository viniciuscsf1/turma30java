package Lista2;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		double num = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if (num <= 0) {
			System.out.println("O n�mero digitado � invalido!"+
		"Escolha um n�mero que seja positivo e maior que 0!!");
		}
		else if (num%2 == 0) {
			System.out.printf("O n�mero � par e sua ra�z �: %.3f",Math.sqrt(num));
		}
		else {
			System.out.println(" O n�mero � impar e seu quadrado �: "+Math.pow(num, 2));
		}

	}

}

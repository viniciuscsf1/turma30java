package Lista2;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0 , num3 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros e o programa lhe"+
		"dirá qual deles é o maior!!");
		System.out.print("Digite o primeiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.print("O maior número digitado foi o: "+ num1);
		}
			
		else if (num2 > num1 && num2 > num3) {
			System.out.print("O maior número digitado foi o: "+ num2);
		}
		else {
			System.out.print("O maior número digitado foi o: "+ num3);
		}
	}

}

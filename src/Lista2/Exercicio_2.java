package Lista2;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0 , num3 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros e o programa os"+
		"colocará em ordem crescente!!");
		System.out.print("Digite o primeiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro: ");
		num3 = leia.nextInt();
		
		//numero 3 > 2 > 1
		if (num1 < num2 && num2 < num3) {
			System.out.print(num1+" ... "+num2+" ... "+num3);
		}
		//numero 1 > 2 > 3	
		else if (num1 > num2 && num2 > num3) {
			System.out.print(num3+" ... "+num2+" ... "+num1);
		}
		//numero 2 > 1 > 3
		else if (num2 > num1 && num1 > num3){
			System.out.print(num3+" ... "+num1+" ... "+num2);
		}
		//numero 2 > 3 > 1
		else if (num1 < num2 && num1 < num3){
			System.out.print(num1+" ... "+num3+" ... "+num2);
		}
		//numero 1 > 3 > 2
		else if (num1 > num3 && num3 > num2){
			System.out.print(num2+" ... "+num3+" ... "+num1);
		}
		//numero 3 > 1 > 2
		else {
			System.out.print(num2+" ... "+num1+" ... "+num3);
		}
	}

}


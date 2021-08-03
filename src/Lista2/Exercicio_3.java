package Lista2;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, num2 = 0 , num3 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é infantil");
		}

		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é juvenil");
		}
		else if (idade >= 18 && idade <= 25){
			System.out.println("Sua categoria é adulto");
		}
		else {
			System.out.println("Idade sem categoria, escolha entre 10 e 25 anos");
		}
	}
	

}

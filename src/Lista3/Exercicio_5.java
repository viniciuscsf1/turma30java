package Lista3;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 1, soma = 0;
		System.out.println("Digite 0 quando quiser parar o programa!");
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			soma += num;
		}while(num != 0);
		System.out.printf("A soma dos n�meros digitados � %d", soma);
				

	}

}

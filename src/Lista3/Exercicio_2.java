package Lista3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0, par= 0, impar = 0, x;
		
		System.out.println("Digite 10 números");
		for (x = 1; x<=10; x++) {
			System.out.printf("Digite o %dº: ", x);
			num = leia.nextInt();
			if(num%2==0) {
				par ++;
			}
			else {
				impar++;
			}
			
		}System.out.printf("Você digitou %d números pares", par);
		 System.out.printf("\nVocê digitou %d números impares", impar);

	}

}

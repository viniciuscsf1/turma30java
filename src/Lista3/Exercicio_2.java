package Lista3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0, par= 0, impar = 0, x;
		
		System.out.println("Digite 10 n�meros");
		for (x = 1; x<=10; x++) {
			System.out.printf("Digite o %d�: ", x);
			num = leia.nextInt();
			if(num%2==0) {
				par ++;
			}
			else {
				impar++;
			}
			
		}System.out.printf("Voc� digitou %d n�meros pares", par);
		 System.out.printf("\nVoc� digitou %d n�meros impares", impar);

	}

}

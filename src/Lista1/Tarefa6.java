package Lista1;

import java.util.Scanner;

public class Tarefa6 {
	public static void main(String[]args){
		double x1, x2, y1, y2, d, p1, p2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Cálculo da distância entre dois pontos");
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.printf("A distância entre os dois pontos é: %.2f",d);
		
		
		}
}

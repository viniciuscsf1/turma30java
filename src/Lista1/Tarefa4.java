package Lista1;
import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[]args) {
		int a, b, c;
		double d; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números positivos inteiros");
		System.out.print("Digite o primeiro: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro: ");
		c = leia.nextInt();
		d = (Math.pow((a+b),2)+Math.pow((b+c),2))/2.0;
		System.out.println("O resultado da expressão é: "+d);
		
	}
}


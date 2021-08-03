package Lista1;
import java.util.Scanner;

public class Tarefa7 {
	public static void main(String[]args) {
		double A,B,C,D,E,F,x,y;
		Scanner leia = new Scanner(System.in);
		System.out.println("Programa de resolução de sistemas de equações. Digite 6 números: ");
		System.out.print(" Digite o primeiro número: ");
		A = leia.nextDouble();
		System.out.print(" Digite o segundo número: ");
		B = leia.nextDouble();
		System.out.print(" Digite o terceiro número: ");
		C = leia.nextDouble();
		System.out.print(" Digite o quarto número: ");
		D = leia.nextDouble();
		System.out.print(" Digite o quinto número: ");
		E = leia.nextDouble();
		System.out.print(" Digite o sexto e último número: ");
		F = leia.nextDouble();
		x = ((C*E) - (B*F))/((A*E) - (B*D));
		y = ((A*F) - (C*D))/((A*E) - (B*D));
		/* o printf serve para formatar o valor de saída, dessa forma ele
		só altera a EXIBÇÃO, nao armazenando o valor da variável
		para isso, tem q digitar %.numero de casas decimaisf
		%f - double (%.2f)
		%d - inteiro
		%s - string
		%d - boolean*/
		System.out.printf(" O valor de x é %.3f",x);
		System.out.printf(" O valor de y é %.3f",y);
	}
}

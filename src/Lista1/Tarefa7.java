package Lista1;
import java.util.Scanner;

public class Tarefa7 {
	public static void main(String[]args) {
		double A,B,C,D,E,F,x,y;
		Scanner leia = new Scanner(System.in);
		System.out.println("Programa de resolu��o de sistemas de equa��es. Digite 6 n�meros: ");
		System.out.print(" Digite o primeiro n�mero: ");
		A = leia.nextDouble();
		System.out.print(" Digite o segundo n�mero: ");
		B = leia.nextDouble();
		System.out.print(" Digite o terceiro n�mero: ");
		C = leia.nextDouble();
		System.out.print(" Digite o quarto n�mero: ");
		D = leia.nextDouble();
		System.out.print(" Digite o quinto n�mero: ");
		E = leia.nextDouble();
		System.out.print(" Digite o sexto e �ltimo n�mero: ");
		F = leia.nextDouble();
		x = ((C*E) - (B*F))/((A*E) - (B*D));
		y = ((A*F) - (C*D))/((A*E) - (B*D));
		/* o printf serve para formatar o valor de sa�da, dessa forma ele
		s� altera a EXIB��O, nao armazenando o valor da vari�vel
		para isso, tem q digitar %.numero de casas decimaisf
		%f - double (%.2f)
		%d - inteiro
		%s - string
		%d - boolean*/
		System.out.printf(" O valor de x � %.3f",x);
		System.out.printf(" O valor de y � %.3f",y);
	}
}

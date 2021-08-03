package Lista1;
import java.util.Scanner;

public class Tarefa5 {
	public static void main(String[]args) {
		double nota1,nota2,nota3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as as três notas do aluno para calcular a média: ");
		System.out.print("Digite a primeira: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		System.out.println("A média do aluno é: "+media);
	}
}

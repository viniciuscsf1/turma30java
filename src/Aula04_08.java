import java.util.Scanner;

public class Aula04_08 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		String nome = "", nomeMaiorSalario = "";
		int salario = 1, maiorSalario = 0;
		
		while (salario>0) {
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			System.out.println("Digite o nome: ");
			nome = leia.next();
			System.out.println("Digite o sal�rio: ");
			salario =leia.nextInt();
		}
		System.out.printf("O maior salario � %d da pessoa %s", maiorSalario, nomeMaiorSalario);
		
		
	}
	
}

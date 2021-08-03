import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[]args) {
		String nome;
		int anoNascimento;
		int idade;
		/* O java não tem uma funcao nativa para ler a entrada do usuário,
		 * para isso é necessário utilizar uma biblioteca e depois chamar 
		 * o comando next. 
		 * O leia não é um comando, é um objeto. 
		 */
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite o nome: ");
		/* o next serve para ler UMA string, esse comando funciona
		 * APENAS para string. 
		 * Agora para ler mais de uma string, utilize nextLine
		 */
		nome = leia.next();
		anoNascimento = 1960;
		idade = 2021 - anoNascimento;
		System.out.println("Oi "+nome+" sua idade é "+ idade +" anos");
	}

}

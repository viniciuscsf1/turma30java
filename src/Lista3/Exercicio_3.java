package Lista3;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, pessoasJovens = 0, pessoasAdultas =0;
		System.out.println("Programa leitor de idades+ "
				+ "Para encerrar o programa, digite -99!");
		while(idade > -99) {
			idade = leia.nextInt();
			if (idade >= 1 && idade <21) {
				pessoasJovens++;
			}
			else if(idade>50) {
				pessoasAdultas++;
			}
			else if(idade<=0 && idade != -99){
				System.out.println("Digite uma idade válida!");
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + pessoasJovens);
		System.out.println("Total de pessoas com mais de 50 anos: "+pessoasAdultas);
	}

}

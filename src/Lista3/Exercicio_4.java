package Lista3;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, contador=0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, nervososMaiorQue40 = 0, calmasComMenosQue18 = 0;
		char opcao = ' ', sexo = ' ';
		
		while(contador < 150) {
			contador++;
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();
			System.out.println("Qual seu sexo? Digite:\n1 para feminino\n2 para masculino\n3 para Outros");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha:\n1 se voc� � calmo(a/e)\n2 se voc� � nervoso(a/e)\n3 se voc� � agressivo(a/e)");
			opcao = leia.next().charAt(0);
			if(opcao == '1') {
				pessoasCalmas++;
			}
			if(sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if(opcao == '2' && idade > 40) {
				nervososMaiorQue40++;
			}
			if(opcao == '1' && idade < 18) {
				calmasComMenosQue18++;
			}
		}
			System.out.printf("%d pessoas s�o calmas",pessoasCalmas);
			System.out.printf("\n%d mulheres s�o nervosas",mulheresNervosas);
			System.out.printf("\n%d homens s�o agressivos",homensAgressivos);
			System.out.printf("\n%d pessoas que n�o se identificam como homens ou mulheres s�o calmas",outrosCalmos);
			System.out.printf("\n%d pessoas s�o nervosas e maiores de 40 anos",nervososMaiorQue40);
			System.out.printf("\n%d pessoas s�o calmas e menores de 18 anos",calmasComMenosQue18);

	}

}

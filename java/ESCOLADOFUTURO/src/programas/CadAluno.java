package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner leia = new Scanner(System.in);
		String alunes[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length]; //MAT-0X
		boolean ativo[] = new boolean[alunes.length];
		String situacao[] = new String[alunes.length];
		String auxMat; 
		String auxAtivo="";
		char op;

		
		//Gerando a Matricula 
		System.out.println("");
		
		 for (int x=0; x<alunes.length; x++) {
			if(x==8) {
				matriculas[x] = "MAT-1"+(x+1);
			}
			else {
				matriculas[x] = "MAT-"+(x+1);
			}
			ativo[x] = true;
		}
				
		//Mostrar todos os Alunos com Matricula e Nota
		System.out.println("Mat\tAlunes\t");
		
			for(int x=0;x<matriculas.length;x++){
				System.out.printf("%s\t %s\t %d \t",matriculas[x],alunes[x],notas[x]);
				if(ativo[x] == true) {
					System.out.println(" Ativo \n");
				}else 
				{
					System.out.println(" Inativo \n");
				}
		}

			do {	
				
				System.out.print("Digite o n�mero da Matricula: ");
		 		auxMat = leia.next().toUpperCase();
		 		for(int x=0;x<alunes.length; x++) { 
		 			if(auxMat.equals(matriculas[x])){
		 				System.out.print("Qual � a nota do Alune? : ");
		 				notas[x] = leia.nextInt();
		 				if(notas[x] > 10) {
		 					System.out.print("Digite uma nota valida ");
		 					notas[x] = 0;
		 					System.out.print("Qual � a nota do Alune? : ");
		 					notas[x] = leia.nextInt();
		 				}
		 				System.out.print("Qual � a Situa��o do Alune : (Ativo)|(Inativo) ");
		 				auxAtivo = leia.next().toUpperCase(); 
		 				
		 				if(auxAtivo.equals("ATIVO")){
		 					ativo[x] = true;
		 			}else if (auxAtivo.equals("INATIVO")) {
		 				ativo[x] = false;
		 			}else {
		 				System.out.print("O aluno est� ativo sim ou n�o");
		 				}
		 			}
		 		}
			 System.out.print("Voc� deseja continuar? (S|N)" );
			 op = leia.next().toUpperCase().charAt(0);
	
			}while(op == 'S');
			
			

			 System.out.println("Mat\tAlunes\t\tNota\t");
				for(int x = 0; x< alunes.length; x++) {
					if(notas[x] != 0){
						
						System.out.printf("%s\t%s\t%d\t%s\n ",matriculas[x],alunes[x],notas[x],auxAtivo);
						if(notas[x] <= 5) {
							System.out.println("Estude mais !!!");
						}
						if(notas[x] > 5) {
							System.out.println("�timo, continue assim !!!");
					}
			 }
		}
				
	}//Fecha Func�o

}
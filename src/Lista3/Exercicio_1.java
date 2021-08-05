package Lista3;


public class Exercicio_1 {

	public static void main(String[] args) {
		int pulaLinha = 0;
		System.out.println("     Números de 1000 a 1999 que quando divididos por 11"
				+ " obtemos resto = 5     ");
		System.out.println("     ---------------------------------------------------------"+
				"-----------");
		for(double x = 1000;x <=1999;x++){
			if(x%11 == 5) {
				System.out.print(x + ", ");
				pulaLinha++;
					if(pulaLinha >=10) {
						System.out.println();
						pulaLinha = 0;
					}
			}
			
			
		}

	}

}

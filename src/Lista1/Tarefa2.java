package Lista1;
import java.util.Scanner;


public class Tarefa2 {
	public static void main(String[]args) {
		int anos, meses, dias;
		
		System.out.println("Digite sua idade em dias: ");
		Scanner leia = new Scanner(System.in);
		dias = leia.nextInt();
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		System.out.println("Você tem: "+anos+" anos "+meses+ " meses e "+dias+" dias de vida!!");
		
		
	}
	
}

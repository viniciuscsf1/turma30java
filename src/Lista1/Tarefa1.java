package Lista1;
import java.util.Scanner;

public class Tarefa1 {
		public static void main(String[]args) {
			int anos, meses, dias;
			System.out.println("Digite exatamente quantos anos, meses e dias de vida você tem: ");
			System.out.print("Comece digitando os anos: ");
			Scanner leia = new Scanner(System.in);
			anos = leia.nextInt();
			System.out.print("Agora digite os meses: ");
			meses = leia.nextInt();
			System.out.print("E os dias: ");
			dias = leia.nextInt();
			dias = dias + meses*12 + anos * 365;
			System.out.println("Você tem exatamente "+ dias + " dias de vida");
		}
}
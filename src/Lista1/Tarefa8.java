package Lista1;
import java.util.Scanner;

public class Tarefa8 {
	public static void main(String[]args) {
		double custo;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custo = leia.nextDouble();
		custo = custo + (custo*0.28) + (custo*0.45);
		System.out.println("Custo total para o consumidor: "+custo);
	}

}

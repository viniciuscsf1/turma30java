package Lista1;
import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[]args) {
		int segundo, minuto, hora;
		
		System.out.println("Digite, em segundos, o tempo do processo: ");
		Scanner leia = new Scanner(System.in);
		segundo = leia.nextInt();
		hora = segundo/3600;
		minuto = (segundo%3600)/60;
		segundo = (segundo%3600)%60;
		System.out.println("Duração do processo: "+hora+" horas, "+minuto+ 
				" minutos e "+segundo+" segundos");
	}
}

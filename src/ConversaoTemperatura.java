import java.util.Locale;
import java.util.Scanner;

/*programa
{
  
  funcao inicio()
  {	
	real c, f 
	escreva ("Digite uma temperatura em graus Celsius e pressione ENTER: ")
	leia (c)
	f = - (9*c+160)/5
	escreva ("A temperatura em graus Fahrenheit é: ", f) 
  }
}
]
*/
public class ConversaoTemperatura {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		double celcius, fahrenheit;
		String nome;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Oi"+ nome);
		System.out.println("Digite uma temperatura em graus Celsius "
		+ "e pressione ENTER: ");
		celcius = leia.nextDouble();
		fahrenheit = (9*celcius)/5 + 32;
		
		System.out.println("A temperatura em graus Fahrenheit é: "+fahrenheit);
	}
}

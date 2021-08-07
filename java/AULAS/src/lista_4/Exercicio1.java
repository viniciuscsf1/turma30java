package lista_4;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Exercicio1 {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Yang Zhao";
		cliente1.email = "yangzhao123@gmail.com";
		cliente1.idade = 32;
		cliente1.pais = "China";
		
		cliente1.informacaoCliente();

	}

}

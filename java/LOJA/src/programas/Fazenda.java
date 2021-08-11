package programas;
//teste
import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;
import entidades.Preguica;

public class Fazenda {

	public static void main(String[] args) {
		Cachorro animal1 = new Cachorro("Totó", 5);
		Cavalo animal2 = new Cavalo("Pé de Pano", 8);
		Preguica animal3 = new Preguica("Cid", 12);
	
		
		System.out.println(animal1.getNome()+" "+animal1.getIdade()+" anos");
		animal1.emiteSom();
		animal1.somBicho();
		System.out.println();
		System.out.println(animal2.getNome()+" "+animal2.getIdade()+" anos");
		animal2.emiteSom();
		animal2.somBicho();
		System.out.println();
		System.out.println(animal3.getNome()+" "+animal3.getIdade()+" anos");
		animal3.emiteSom();
		animal3.somBicho();
	
	
	}


}

package programas;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Fazenda {

	public static void main(String[] args) {
		Animal animal1 = new Cachorro("Tot�", 5, true, true);
		Animal animal2 = new Cavalo("P� de Pano", 8, true, true);
		Animal animal3 = new Preguica("Cid", 12, true, true);
	}

}

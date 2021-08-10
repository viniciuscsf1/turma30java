package entidades;

public class Preguica extends Animal{
	private boolean sobeEmArvore;

	public Preguica(String nome, int idade, boolean emiteSom, boolean sobeEmArvore) {
		super(nome, idade, emiteSom);
		this.sobeEmArvore = sobeEmArvore;
	}

	public boolean isSobeEmArvore() {
		return sobeEmArvore;
	}

	public void setSobeEmArvore(boolean sobeEmArvore) {
		this.sobeEmArvore = sobeEmArvore;
	}
}

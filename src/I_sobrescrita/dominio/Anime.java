package I_sobrescrita.dominio;

public class Anime {
	private String nome;
	
	@Override
	public String toString() {
		return "Anime: " + this.nome;
	}

	public Anime(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

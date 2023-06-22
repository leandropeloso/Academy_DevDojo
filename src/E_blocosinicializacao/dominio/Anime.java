package E_blocosinicializacao.dominio;

public class Anime {
	private String nome;
	private int[] episodios;
	// 1 - Alocado espa�o em mem�ria para o objeto
	// 2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
	// 3 - Bloco de inicializa��o �  executado
	// 4 - Construtor � executado
	
	{
		System.out.println("Dentro do bloco de inicializa��o!");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1;
		}
	}
	
	public Anime(String nome) {
		this.nome = nome;
	}
	public Anime() {
		for (int episodios : this.episodios) {
			System.out.print(episodios + " ");
		}
		System.out.println();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
	
}

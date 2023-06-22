package F_modificadorestatico.dominio;

public class Anime {
	private String nome;
	private static int[] episodios;
	// 0 - Bloco de inicializa��o � executado quando a JVM carregar a classe
	// 1 - Alocado espa�o em mem�ria para o objeto
	// 2 - Cada atributo de classe � criado e inicializado com valores default ou o
	// que for passado
	// 3 - Bloco de inicializa��o � executado
	// 4 - Construtor � executado

	static {
		System.out.println("Dentro do bloco de inicializa��o est�tico 1!");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}
	
	static {
		System.out.println("Dentro do bloco de inicializa��o est�tico 2!");
	}
	
	static {
		System.out.println("Dentro do bloco de inicializa��o est�tico 3!");
	}
		
	{
		System.out.println("Dentro do bloco de inicializa��o n�o est�tico!");
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		for (int episodios : Anime.episodios) {
			System.out.print(episodios + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

}

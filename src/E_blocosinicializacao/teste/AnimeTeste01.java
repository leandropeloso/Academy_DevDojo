package E_blocosinicializacao.teste;

import E_blocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
	public static void main(String[] args) {
		Anime anime = new Anime();

		for (int episodios : anime.getEpisodios()) {
			System.out.print(episodios + " ");
		}
	}
}

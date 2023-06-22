package C_sobrecargametodos.teste;

import C_sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
	public static void main(String[] args) {
		Anime anime = new Anime();
		anime.init("Akudama Drive", "TV", 12);
		anime.init("Akudama Drive", "TV", 12, "A��o");
		anime.imprime();
	}
}

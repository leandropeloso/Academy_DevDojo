package G_associacao.teste;

import G_associacao.dominio.Jogador;

public class JogadorTeste01 {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pel�");
		Jogador jogador2 = new Jogador("Rom�rio");
		Jogador jogador3 = new Jogador("Caf�");

		Jogador[] jogadores = {jogador1, jogador2, jogador3};
				
		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}
}

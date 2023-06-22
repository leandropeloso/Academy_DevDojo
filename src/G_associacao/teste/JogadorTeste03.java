package G_associacao.teste;

import G_associacao.dominio.Jogador;
import G_associacao.dominio.Time;

public class JogadorTeste03 {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Caf�");
		Jogador jogador2 = new Jogador("Pel�");
		
		Time time = new Time("Brasil");
		
		Jogador[] jogadores = {jogador, jogador2};

		jogador.setTime(time);
		jogador2.setTime(time);
		
		time.setJogadores(jogadores);

		System.out.println("--------Jogador--------");

		jogador.imprime();

		System.out.println("--------Time--------");

		time.imprime();
	}

}

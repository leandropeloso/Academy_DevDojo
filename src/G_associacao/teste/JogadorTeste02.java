package G_associacao.teste;

import G_associacao.dominio.Jogador;
import G_associacao.dominio.Time;

public class JogadorTeste02 {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador ("Pel�");
		Time time = new Time ("Sele��o Brasileira");
		
		jogador1.setTime(time);
		
		jogador1.imprime();
	}
}

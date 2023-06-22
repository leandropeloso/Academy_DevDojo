package G_associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("-------------------------------------------------");
		System.out.println("O grande software de previs�o do futuro!");
		System.out.println("-------------------------------------------------");
		System.out.println("Digite sua pergunte e eu responderei SIM ou N�O.");
		System.out.println("-------------------------------------------------");
		
		String pergunta = input.nextLine();
		if (pergunta.charAt(0) == ' ') {
			System.out.println("\nSIM");
		}else {
			System.out.println("\nN�O");
		}
	}
}

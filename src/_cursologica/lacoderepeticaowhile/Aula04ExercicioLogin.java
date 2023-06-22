package _cursologica.lacoderepeticaowhile;

import java.util.Scanner;

public class Aula04ExercicioLogin {
	public static void main(String[] args) {
		final String login = "Leandro";
		final String passoword = "Hacker";
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Digite o seu login: ");
			String loginDigitado = scanner.nextLine();
			System.out.println("Digite sua senha: ");
			String passowordDigitado = scanner.nextLine();
			if ((login.equals(loginDigitado)) && passoword.equals(passowordDigitado)) {
				System.out.println("ACESSO CONCEDIDO");
				break;
			} else 
				System.out.println("ACESSO NEGADO");
		}
		System.out.println("PROGRAMA TERMINADO");
	}
}

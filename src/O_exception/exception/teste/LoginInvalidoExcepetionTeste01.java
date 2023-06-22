package O_exception.exception.teste;

import java.util.Scanner;

import O_exception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExcepetionTeste01 {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void logar() throws LoginInvalidoException {
		Scanner teclado = new Scanner(System.in);
		String usernameDB = "Goku";
		String senhaDB = "ssj";
		System.out.println("Usu�rio");
		String usernameDigitado = teclado.nextLine();
		System.out.println("Senha");
		String senhaDigitada = teclado.nextLine();
		if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
			throw new LoginInvalidoException("Usu�rio ou senha inv�lidos");
		}
		System.out.println("Usu�rio logado com sucesso");
	}
}

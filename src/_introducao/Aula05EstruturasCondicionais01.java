package _introducao;

public class Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		int idade = 18;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alc�lica");
		} else {
			System.out.println("N�o est� autorizado a comprar bebida alc�lica");
		}
	}
}

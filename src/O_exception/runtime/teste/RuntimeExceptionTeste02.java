package O_exception.runtime.teste;

public class RuntimeExceptionTeste02 {
	public static void main(String[] args) {
		divisao(1, 0);

		System.out.println("C�digo Finalizado");
	}

	private static int divisao(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, n�o pode ser 0");
		}
		return a / b;
	}
}

package B_introducaometodos.teste;

import B_introducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		int num1 = 1;
		int num2 = 2;

		calculadora.alteraDoisNumeros(num1, num2);

		System.out.println("\n--------------------------------");
		System.out.println("\nDentro CalculadoraTeste04");
		System.out.println("\nnum1: " + num1);
		System.out.println("\nnum2: " + num2);

	}
}
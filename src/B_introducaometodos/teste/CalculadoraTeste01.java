package B_introducaometodos.teste;

import B_introducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		System.out.println("Finalizando CalculadoraTest01");
	}
}

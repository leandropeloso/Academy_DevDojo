package N_polimorfismo.teste;

import N_polimorfismo.dominio.Computador;
import N_polimorfismo.dominio.Televisao;
import N_polimorfismo.dominio.Tomate;
import N_polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
	public static void main(String[] args) {
		Computador computador = new Computador("NUC10i7", 11000);
		Tomate tomate = new Tomate("Tomate Siciliano", 10);
		Televisao tv = new Televisao("Samsung 50\" ", 5000);
		
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("---------------------------------");
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("---------------------------------");
		CalculadoraImposto.calcularImposto(tv);
	}
}

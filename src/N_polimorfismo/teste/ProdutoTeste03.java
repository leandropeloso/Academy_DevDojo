package N_polimorfismo.teste;

import N_polimorfismo.dominio.Computador;
import N_polimorfismo.dominio.Produto;
import N_polimorfismo.dominio.Tomate;
import N_polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);		
		Tomate tomate = new Tomate("Tomate americano", 20);
		
		tomate.setDataValidade("Data de validade: 11/12/2023");
		
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("--------------------------------");
		CalculadoraImposto.calcularImposto(produto);
		
	}
}
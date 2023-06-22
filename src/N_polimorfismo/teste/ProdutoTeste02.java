package N_polimorfismo.teste;

import N_polimorfismo.dominio.Computador;
import N_polimorfismo.dominio.Produto;
import N_polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		System.out.println("--------------------------------");
				
		Produto produto2 = new Tomate("Tomate americano", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
		
	}
}
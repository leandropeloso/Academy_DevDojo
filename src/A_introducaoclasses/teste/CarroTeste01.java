package A_introducaoclasses.teste;

import A_introducaoclasses.dominio.Carro;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		carro1.nome = "Fusca Bala";
		carro1.modelo = "Sport";
		carro1.ano = 1969;

		carro2.nome = "Mustang";
		carro2.modelo = "GT 500";
		carro2.ano = 1968;

		System.out.println("Nome: " + carro1.nome + " " + "Modelo: " + carro1.modelo + " " + "Ano: " + carro1.ano);
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nNome: " + carro2.nome + " " + "Modelo: " + carro2.modelo + " " + "Ano: " + carro2.ano);
	}
}

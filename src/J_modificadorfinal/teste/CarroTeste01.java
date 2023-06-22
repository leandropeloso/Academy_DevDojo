package J_modificadorfinal.teste;

import J_modificadorfinal.dominio.Carro;
import J_modificadorfinal.dominio.Comprador;
import J_modificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Comprador comprador2 = new Comprador();

		System.out.println(Carro.VELOCIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("La Ferrari");
		ferrari.imprime();
	}
}

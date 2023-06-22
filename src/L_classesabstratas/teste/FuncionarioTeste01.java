package L_classesabstratas.teste;

import L_classesabstratas.dominio.Desenvolvedor;
import L_classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
	public static void main(String[] args) {
		Gerente gerente = new Gerente ("Nami", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor ("Touya", 12000);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}
}

package N_polimorfismo.servico;

import N_polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados");
	}
}

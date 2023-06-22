package N_polimorfismo.servico;

import N_polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo");
	}

}

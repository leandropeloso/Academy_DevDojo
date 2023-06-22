package N_polimorfismo.servico;

import N_polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando em memoria");
	}
}

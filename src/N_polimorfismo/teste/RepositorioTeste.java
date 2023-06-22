package N_polimorfismo.teste;

import java.util.LinkedList;
import java.util.List;

import N_polimorfismo.repositorio.Repositorio;
import N_polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBancoDeDados();
		repositorio.salvar();
		List<String> list = new LinkedList<>();
		list.add("Goku");
		list.add("Vegeta");
		list.add("Kuririn");
		System.out.println(list);
	}
}

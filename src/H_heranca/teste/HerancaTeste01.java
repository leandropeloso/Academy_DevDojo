package H_heranca.teste;

import H_heranca.dominio.Endereco;
import H_heranca.dominio.Funcionario;
import H_heranca.dominio.Pessoa;

public class HerancaTeste01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua dos Hackers");
		endereco.setCep("CEP: 012345-321");
		Pessoa pessoa = new Pessoa("Leandro");
		pessoa.setCpf("CPF: 123456789-21");
		pessoa.setEndereco(endereco);
		System.out.println("--------------------------------");
		pessoa.imprime();

		Funcionario funcionario = new Funcionario("Bianca");
		funcionario.setCpf("CPF: 2222222578-87");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(5000.00);

		System.out.println("--------------------------------");

		funcionario.imprime();
		
		System.out.println("--------------------------------");
	}
}

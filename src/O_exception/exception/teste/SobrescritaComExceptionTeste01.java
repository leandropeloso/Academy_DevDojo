package O_exception.exception.teste;

import java.io.FileNotFoundException;

import H_heranca.dominio.Pessoa;
import O_exception.exception.dominio.Funcionario;
import O_exception.exception.dominio.LoginInvalidoException;

public class SobrescritaComExceptionTeste01 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.salvar();
		} catch (LoginInvalidoException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

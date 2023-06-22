package O_exception.exception.dominio;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Pessoa {
	
	public void salvar() throws LoginInvalidoException, IOException{
		System.out.println("Salvando pessoa");
	}
}

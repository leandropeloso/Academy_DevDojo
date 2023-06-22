package H_heranca.teste;

import H_heranca.dominio.Funcionario2;

	// 0 - Bloco de inicializa��o est�tico da superclasse � executado quando a JVM carregar a classe pai
	// 1 - Bloco de inicializa��o est�tico da sub classe � executado quando a JVM carregar a classe filho
	// 2 - Alocado espa�o em mem�ria para o objeto da superclasse
	// 3 - Cada atributo de superclasse � criado e inicializado com valores default ou que for passado
	// 4 - Bloco de inicializa��o da superclasse � executado na ordem em que aparece
	// 5 - Construtor � executado da superclasse 
	// 6 - Alocado espa�o em mem�ria para o objeto da subclasse
	// 7 - Cada atributo de subclasse � criado e inicializado com valores default ou que for passado
	// 8 - Bloco de inicializa��o da subclasse � executado na ordem em que aparece
	// 9 - Construtor � executado da subclasse 

public class HerancaTeste02 {
	public static void main(String[] args) {
	Funcionario2 funcionario = new Funcionario2 ("Goku");
	}
}

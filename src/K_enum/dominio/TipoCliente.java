package K_enum.dominio;

public enum TipoCliente {
	
	PESSOA_FISICA(1, "Pessoa F�sica"), 
	PESSOA_JURIDICA(2, "Pessoa Jur�dica");
	
	public final int valor;
	private String nomeRelatorio;
	
	TipoCliente(int valor, String nomeRelatorio){
		this.valor = valor;
		this.nomeRelatorio = nomeRelatorio;
	}
	
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for (TipoCliente tipoCliente : values()) {
			if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}		
		}
		return null;
	}

	public int getValor() {
		return valor;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

}

package O_exception.runtime.teste;

public class RuntimeExceptionTeste03 {
	public static void main(String[] args) {
		abreConexao();
	}

	private static String abreConexao() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			return "conex�o aberta";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando recurso liberado pelo SO");
		}
		return null;
	}
	/*
	private static void abreConexao2() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			throw new RuntimeException();
		}finally {
			System.out.println("Fechando recurso liberado pelo SO");
		}
	}*/
}

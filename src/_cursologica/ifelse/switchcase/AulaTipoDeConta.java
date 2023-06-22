package _cursologica.ifelse.switchcase;

public class AulaTipoDeConta {
	public static void main(String[] args) {
		String conta = "CONTA INVESTIMENTO";
		switch (conta) {
			case "CONTA POUPAN�A":
				System.out.println("0.05%");
				break;
			case "CONTA CORRENTE":
				System.out.println("0.02%");
				break;
			case "CONTA INVESTIMENTO":
				System.out.println("0.1%");
				break;
			default:
				System.out.println("CONTA INEXISTENTE");
		}
	}

}

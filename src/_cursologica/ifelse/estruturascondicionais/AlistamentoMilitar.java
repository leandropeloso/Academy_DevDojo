package _cursologica.ifelse.estruturascondicionais;

public class AlistamentoMilitar {
	public static void main (String[]args) {
		char sexo = 'F';
		int idade = 87;
		
		if ((sexo == 'M' || sexo == 'F') && idade < 18){
			System.out.println ("alistamento NAO PERMITIDO");
		} else if (sexo == 'M' && idade >= 18) {
			System.out.println("alistamento OBRIGATORIO");
		} else if (sexo == 'F' && idade >= 18) {
			System.out.println("deseja se alistar");
		}
	}

}

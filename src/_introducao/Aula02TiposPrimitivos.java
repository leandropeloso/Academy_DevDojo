package _introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		// int, double, foat, char, byte, short, long, boolean
		int idade = 29;
		long numeroGrande = 100000;
		double salarioDouble = 2000.00D;
		float salarioFloat = 2500.00F;
		byte idadeByte = 35;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 'L';
		var nome2 = "Vegeta";

		System.out.println("A idade que comecei o curso de Ci�ncias da Computa��o foi: " + idade + " anos");
		System.out.println("O sal�rio que gostaria de ter �: " + numeroGrande + " d�lares por m�s");
		System.out.println("Contudo, meu primeiro sal�rio ser� de: " + salarioDouble + " reais por m�s");
		System.out.println("O meu sal�rio com o aux�lio alimenta��o ser�: " + salarioFloat + " reais");
		System.out.println("A minha idade quando formar em Ci�ncias da Computa��o ser�: " + idadeByte + " anos");
		System.out.println("As senten�as acima s�o: " + verdadeiro);
		System.out.println("A letra inicial de meu nome �: " + caractere);
	}
}

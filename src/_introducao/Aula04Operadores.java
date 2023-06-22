package _introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// resto da divis�o: %
		// operadores l�gicos: <, >, <=, >=, ==, !=, +=, -=, *=, /=, %=
		// tabela l�gica: && (and), || (ou), ! (not)

		int num1 = 10;
		int num2 = 20;
		int resto = 21 % 6;

		System.out.println("A soma de " + num1 + " mais " + num2 + " �: " + (num1 + num2));
		System.out.println("A subtra��o de " + num1 + " menos " + num2 + " �: " + (num1 - num2));
		System.out.println("A multplica��o de " + num1 + " por " + num2 + " �: " + (num1 * num2));
		System.out.println("A divis�o de " + num1 + " por " + num2 + " �: " + (num1 / (double) num2));
		System.out.println("O resto da divis�o de 21 por 6 �: " + resto);

		// ------------------------------------------------------------------------------------------------

		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualQueVinte = 10 == 20;
		boolean isDezDiferenteQueVinte = 10 != 20;

		float salario = 3500F;
		int idade = 35;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade > 34 && salario < 30000;

		System.out.println("10 � maior que 20? " + isDezMaiorQueVinte);
		System.out.println("10 � menor que 20? " + isDezMenorQueVinte);
		System.out.println("10 � igual a 20? " + isDezIgualQueVinte);
		System.out.println("10 � diferente que 20? " + isDezDiferenteQueVinte);
		System.out.println(isDentroDaLeiMaiorQueTrinta);
		System.out.println(isDentroDaLeiMenorQueTrinta);

		// ------------------------------------------------------------------------------------------------

		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
				|| valorTotalContaPoupanca > valorPlaystation;

		System.out.println(isPlaystationCincoCompravel);

		// -------------------------------------------------------------------------------------------------

		double bonus = 1800D;
		bonus = bonus + 1000; // express�o igual: bonus += 1000;
		// Outros exemplos:
		// bonus -= 1000;
		// bonus *= 2;
		// bonus /= 2;
		// bonus %= 2;

		System.out.println(bonus);

		// -------------------------------------------------------------------------------------------------

		int contador = 0;
		// contador += 1 //express�o igual: contador++;

		// contador--;
		// ++contador;
		// --contador;
		// System.out.println(contador++);
		System.out.println(++contador);

	}
}

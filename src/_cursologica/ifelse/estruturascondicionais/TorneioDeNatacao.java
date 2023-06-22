package _cursologica.ifelse.estruturascondicionais;

import java.util.Scanner;

public class TorneioDeNatacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		String nome2 = null;
		if (idade <= 10) {
			System.out.println(nome + " participara da categoria INFANTIL");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println(nome + " participara da categoria JUVENIL");
		} else if (idade >= 16 && idade <= 19) {
			System.out.println(nome + " participara da categoria PRE-ADULTO");
		} else {
			System.out.println(nome + " participara da categoria ADULTO");
		}
	}
}
/*
	tabela logica:
					NEGAÇÃO			(not: !)				comando: ~
					CONJUNÇÃO		(and: ^)				comando: &&
					DISJUNÇÃO		(or: v)					comando: ||
					CONDICIONAL 	(if...then: →)			comando: 
					BICONDICIONAL	(if and only if: ↔)		comando:
	
	operadores logicos:
	
					IGUAL A: 			==
					DIFERENTE DE: 		<> ou !=
					IDÊNTICO:			===
					MENOR QUE:			<
					MENOR OU IGUAL A:	<=
					MAIOR QUE:			>
					MAIOR OU IGUAL A:	>=
	
	operadores aritméticos:
					ADIÇÃO:				+
					SUBTRAÇÃO:			-
					MULTIPLICAÇÃO:		*
					DIVISÃO:			/
					RESTO DA DIVISÃO:	%
					INCREMENTO:			++
					DECREMENTO:			--
	
*/
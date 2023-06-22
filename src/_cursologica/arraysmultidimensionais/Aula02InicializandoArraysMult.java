package _cursologica.arraysmultidimensionais;

import java.util.Scanner;

public class Aula02InicializandoArraysMult {
	public static void main(String[] args) {
		int[][] arrayMult1 = new int[2][3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arrayMult1.length; i++) {
			for (int j = 0; j < arrayMult1[i].length; j++) {
				System.out.println("Digite o valor da posi��o [" + i + "][" + j + " ] ");
				arrayMult1[i][j] = scanner.nextInt();
		}
		}
		for (int i = 0; i < arrayMult1.length; i++) {
			for (int j = 0; j < arrayMult1[i].length; j++)
				System.out.println("[" + i + "][" + j + "]= " + arrayMult1[i][j]);
		}
	}
}

package _introducao;

public class Aula08ArraysMultidimensionais01 {
	public static void main(String[] args) {
		System.out.println("------------ARRAYS MULTIDIMENSIONAIS-------------");
		System.out.println("\n\n------------EXEMPLO FOR (SIMPLES)-------------");
		int[][] dias = new int[3][3];
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 31;

		dias[2][0] = 31;
		dias[2][1] = 28;
		dias[2][2] = 31;

		for (int[] element : dias) {
			for (int j = 0; j < dias[1].length; j++) {
				System.out.println("\n" + element[j]);
			}
		}
		System.out.println("\n\n------------EXEMPLO FOR EACH-------------");

		for (int[] arrBase : dias) {
			for (int num : arrBase) {
				System.out.println("\n" + num);
			}
		}
	}
}

package _cursologica.arraysmultidimensionais;

public class Aula01Introducao2 {
	public static void main(String[] args) {
		int [][] arrayMult1 = new int[2][3];
		arrayMult1 [0][0] = 22;
		arrayMult1 [0][1] = 11;
		arrayMult1 [0][2] = 54;
		arrayMult1 [1][0] = 44;
		arrayMult1 [1][1] = 55;
		arrayMult1 [1][2] = 76;
		System.out.println(arrayMult1[0][0]);
		System.out.println(arrayMult1[0][1]);
		System.out.println(arrayMult1[0][2]);
		System.out.println(arrayMult1[1][0]);
		System.out.println(arrayMult1[1][1]);
		System.out.println(arrayMult1[1][2]);
	}
}

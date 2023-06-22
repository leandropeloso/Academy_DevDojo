package _cursologica.ifelse.switchcase;

public class Aula01DiasDaSemana {
	public static void main(String[] args) {
		int dia = 9;
		switch (dia) {
		case 1:
			System.out.println("segunda-feira");
			break;
		case 2:
			System.out.println("ter�a-feira");
			break;
		case 3:
			System.out.println("quarta-feira");
			break;
		case 4:
			System.out.println("quinta-feira");
			break;
		case 5:
			System.out.println("sexta-feira");
			break;
		case 6:
			System.out.println("s�bado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("Dia Inv�lido!");
		}
		System.out.println("Fim do programa!");
	}
}

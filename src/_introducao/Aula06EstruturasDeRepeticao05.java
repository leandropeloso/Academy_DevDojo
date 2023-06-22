package _introducao;

public class Aula06EstruturasDeRepeticao05
{

	public static void main(String[] args) {
		double valorTotal = 30000D;

		for (int parcela = (int) valorTotal; parcela >= 1l; parcela--) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
		}
	}
}
/*
 * Crie uma classe que calcule uma determinada porcentagem de um dado salario
 * Criar uma classe
 * Aceitar um valor de entrada para o salario
 * Definir o valor da porcentagem
 * Calular a porcentagem
 * 
 * Crie uma variável que irá guardar o valor de um salário
 * Calcule a porcentagem desse salário, os valores da porcentagem serão:
 * 30%
 * 15%
 * 5%
 * A cada vez que você calcular, guarde o resultado em uma variável e reutilize a variável que guarda o resultado para o novo cálculo
 */

package _cursologica.variaveis;

public class CalculadoraImposto {
	public static void main (String [] args) {
	float salario = 2500.00F;
	float porcentagem = 30L;
	double porcentagemDoSalario = salario * (porcentagem / 100);
	System.out.println(porcentagemDoSalario);
	}
}
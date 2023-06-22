package B_introducaometodos.teste;

import B_introducaometodos.dominio.Estudante;
import B_introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante ();
		Estudante estudante02 = new Estudante ();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante01.nome = "Midoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';	
		
		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';	
		
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		System.out.println("\n########################");
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);

		
		/*System.out.println("Estudante 01");
		
		System.out.println(estudante01.nome);
		System.out.println(estudante01.idade);
		System.out.println(estudante01.sexo);
		
		System.out.println("\n--------------------------------");
		System.out.println("\nEstudante 02");
		
		System.out.println(estudante02.nome);
		System.out.println(estudante02.idade);
		System.out.println(estudante02.sexo);*/
	}
}

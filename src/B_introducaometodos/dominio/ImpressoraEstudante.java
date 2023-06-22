package B_introducaometodos.dominio;

public class ImpressoraEstudante {
	public void imprime(Estudante estudante) {
		
		System.out.println("\n--------------------------------");
		System.out.println("\nEstudante: ");
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		estudante.nome = "Gohan";
	}
}
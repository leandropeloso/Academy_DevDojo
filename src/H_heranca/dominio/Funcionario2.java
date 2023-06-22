package H_heranca.dominio;

public class Funcionario2 extends Pessoa2 {

	private double salario;
	
	static {
		System.out.println("Dentro do bloco de inicializa��o est�tico de funcion�rio");
	}
	
	{
		System.out.println("Dentro do bloco de inicializa��o de funcion�rio 1");
	}
	
	{
		System.out.println("Dentro do bloco de inicializa��o de funcion�rio 2");
	}
	
	public Funcionario2(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcion�rio");
	}
	
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
	public void relatorioPagamento() {
		System.out.println("---------------");
		System.out.println("Eu " + this.nome + "recebi o sal�rio de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

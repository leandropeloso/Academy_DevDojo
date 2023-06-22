package G_associacao.teste;

import G_associacao.dominio.Aluno;
import G_associacao.dominio.Local;
import G_associacao.dominio.Professor;
import G_associacao.dominio.Seminario;

public class AssociacaoTeste {
	public static void main(String[] args) {
		Local local = new Local("Endere�o: Rua dos Hackers");
		Aluno aluno = new Aluno("Leandro Peloso", 34);
		Professor professor = new Professor("Luis Paulo", "Hacker");
		Aluno[] alunosParaSeminario = { aluno };
		
		Seminario seminario = new Seminario("Como se tornar Dev", alunosParaSeminario, local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}
}

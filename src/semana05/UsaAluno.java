package semana05;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		a1.ra = "1";
		a1.nome = "Laura";
		a1.curso = "ADS";
		System.out.println(a1.mostrar());
		a1.inserir();
		a1.excluir("1");
	}

}

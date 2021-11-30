package semana05;

public class Aluno {

	public String ra, nome, curso;
	
	public void inserir() {
		System.out.println("Inserindo o aluno");
		
	}
	public void excluir(String ra) {
		System.out.println("Excluindo o aluno" + ra);
}
	public String mostrar() {
		return "["+ra+","+nome+","+curso+"]";
	}


}

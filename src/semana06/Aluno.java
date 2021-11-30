package semana06;

public class Aluno {

	public String ra, nome;
	private String curso;
	
	public void definirCurso(String nome) {
		nome = nome.toUpperCase();
		if(nome.equals("ADS") || nome.equals("GE") || nome.equals("COMEX"))
			curso = nome;
		else
			curso = "Inexistente";
		
	}

	public void mostrar() {
		System.out.println(ra+","+nome+","+curso);
		
	}
	
}

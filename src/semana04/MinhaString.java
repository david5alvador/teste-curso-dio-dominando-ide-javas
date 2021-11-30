package semana04;

public class MinhaString {
	
	int a;
	String s;
	
	/**
	 * Recebe o RA e retorna o número do curso.
	 * 105 048 171 30 16
	 * @param ra - o RA completo do aluno
	 * @return - o código do curso
	 */
	public static String pegaCurso(String ra) {
		
		if(ra.length()==13) {
			return ra.substring(3,6);
		}
		
		else {
			return "-1";
		}
		
	}
	
	public static boolean validarRA(String ra) {
		
		return true ;
		
	}
	}
	


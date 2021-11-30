package aula06pdf;

public class Aluno {


	/**
	 * Restringindo o acesso as variaveis das instâncias nota1 e nota2 
	 */
	private double nota1, nota2;
	public final int NOTA_MAXIMA = 10;
	public final int NOTA_MINIMA = 0;
	
	/**
	 * método para alterar nota1
	 * @param nota1
	 */
	public void setNota1(double nota1) {
		if(nota1>=0 && nota1<=10) {
		this.nota1 = nota1;
		}
		else {
			System.out.println("Nota 1 inválida, entre com notas entre 0 e 10");
		}
	}	
	/**
	 * Método para alterar nota2
	 * @param nota2
	 */
	public void setNota2(double nota2) {
		if(nota2>=0 && nota2<=10) {
		this.nota2 = nota2;
	}
		else {
			System.out.println("Nota 2 inválida, entre com notas entre 0 e 10");
		}
	}
	
	/**
	 * Método para informar a média das notas	
	 * @return
	 */
		
	public double getMedia() {
	
		System.out.print("A média das notas é: ");
		return (nota1+nota2)/2;
	}
}

	


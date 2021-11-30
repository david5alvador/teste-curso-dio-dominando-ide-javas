package semana05;


import java.util.List;

import javax.swing.JOptionPane;

public class Exercicios {

	//método b)
	
	

	/**
	 * Gera a tabuada de um número fornecido, seguindo o formato abaixo:
	  3 x 0 = 0
	  3 x 1 = 3
	 *@param numero - o número que será gerado a tabuada 
	 */
	
	public static void gerarTabuada(int numero) {
		String s = "";
		if(numero>=1 && numero<=10) {
			for (int indice=0; indice<=10; indice++) {
				s += numero + " x " + indice + " = " + (numero*indice)+ "\n";
				}
				JOptionPane.showMessageDialog(null, s);
		}
		else {
			System.out.println("Número inválido");
		}
	}
	
	// Exercicio e)
	public static void mostrarNomes(List<String> nomes) {
		//iterator
		for(String s:nomes) {
			System.out.println(s);
		}
	}
	
	
	//Exercicio g)
	public static int somar(int[] n) {
		int soma = 0;
		for(int i=0; i<n.length; i++) {
			soma += n[i];
			
		}
		
		return soma;
	}
	
	//Exercicio h)

	public static float calcularMedia(float... notas) {
		
		float media = 0;
		for(int i=0; i<notas.length; i++) {
			media += notas[i];
		}
		media = media / notas.length;
		
		return media;
		
	}
	//Exercicio j)
	
	public static boolean validar(String cpf) {
		
		
			if(cpf.length()==14 && cpf.charAt(3)=='.' && cpf.charAt(7)=='.' && cpf.charAt(11)=='/') {
				String s = cpf.substring(0,3)+
						   cpf.substring(4,7)+
						   cpf.substring(8,11)+
						   cpf.substring(12);
				
				try {
					Long.parseLong(s);
					return true;
					
				}
				catch(NumberFormatException erro) {
					System.out.println(erro.toString());
				}
				
			
			}
		
		return false;
		
	
	}
	
	
	
}



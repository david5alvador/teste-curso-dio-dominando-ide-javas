package exercicios;

import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		
		/*int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro entre 1 e 7"));
		
		String dia = "";
		if(n==1) dia = "Domingo";
		else if(n==2) dia = "Segunda";
		else if(n==3) dia = "Terça";
		else if(n==4) dia = "Quarta";
		else if(n==5) dia = "Quinta";
		else if(n==6) dia = "Sexta";
		else if(n==7) dia = "Sábado";
		else dia = "Inexistente";
		
		System.out.println(dia);*/
		
		
		
		//Tabuada
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro entre 1 e 10"));
		if(n<0 || n>10)
			
			System.out.println("Número inválido");
			
		else
				
			for(int x=1; x<=10; x++) {
			System.out.println(n+" x "+x+" = "+x*n);
		}

	}
}


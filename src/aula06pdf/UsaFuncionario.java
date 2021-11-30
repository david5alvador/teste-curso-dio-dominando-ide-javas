package aula06pdf;

import semana07.Produto;

public class UsaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Antonio");	
		f1.setSalario(14000);
		f1.aumentaSalario(23.5);
		f1.mostra();
		
		}

}


 // após a alteração do modificador de acesso dos atributos e do construtor para privado a classe UsaFuncionario 
// deixou de funcionar, pois  o Método construtor não estava mais acessível.
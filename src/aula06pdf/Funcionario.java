package aula06pdf;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void mostra() {
		System.out.println(nome + " ganha " + salario +" reais");
	}
	public void aumentaSalario (double aumento) {
		salario *= 1 + aumento / 100;
	}
}

package semana06;

public class ContaBancaria {

	public String titular;
	private double saldo;
	private final int LIMITE_DIARIO = 1000;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public String sacar(double valor) {
		String men = "";
		if(valor<=LIMITE_DIARIO) {
			if (valor<=saldo ) {
				saldo -= valor;
				men = "Saque realizado com sucesso!";
			}
			else {
				men = "Saldo insuficiente!";
			} 
		}	
		else {
			men = "Limite diário atingido:  "+LIMITE_DIARIO;
		}
		return men;
		}
	
	public double consultar() {
		return saldo;
	}
}

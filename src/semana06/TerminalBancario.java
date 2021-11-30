package semana06;

import javax.swing.JOptionPane;

public class TerminalBancario {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.titular = "David";
		c1.depositar(100);
		JOptionPane.showMessageDialog(null, c1.sacar(100));
		JOptionPane.showMessageDialog(null,"Saldo atual: "+ c1.consultar());
	}
}

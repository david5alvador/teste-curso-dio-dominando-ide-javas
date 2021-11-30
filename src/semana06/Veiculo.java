package semana06;

public class Veiculo {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		motor.ligar();
		for(int a=1;a<=90;a++) { 
			motor.acelerar();
	}
		motor.mostrar();
		motor.desligar();
}
}

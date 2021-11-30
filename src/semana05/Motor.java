package semana05;


/**
 * Simula o funcionamento de um motor
 * @author David
 *
 */
	public class Motor {
	
	public int voltagem;
	public int velocidade;
	public boolean status; //true = motor ligado
	
	public void mostrar() {
		System.out.println(voltagem);
		System.out.println(velocidade);
		System.out.println(status);
	}
	public void aumentarVelocidade() {
		velocidade++;
		
	}
	public void reduzirVelocidade() {
		velocidade--;
		
	}
	public void ligar() {
		status = true;
		
	}
	public void desligar() {
		status = false;
		
	}
}

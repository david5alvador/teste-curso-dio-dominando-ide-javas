package semana06;

public class Motor {
	
		private boolean status;
		private int velocidade;
		public final int VELOCIDADE_MAXIMA = 100;
		public final int VELOCIDADE_MINIMA = 0;
		
		public void ligar() {
			status = true;
		}
		
		public void desligar() {
			status = false;
		}
		
		public void acelerar() {
			
			if(status && velocidade<VELOCIDADE_MAXIMA)
			velocidade++;
			
		}
		public void frear() {
			if(status && velocidade<VELOCIDADE_MINIMA)
			velocidade--;
			
		}
		public void mostrar() {
			System.out.println(status);
			System.out.println(velocidade);
		}
}

package semana05;

public class Impressora {

	synchronized public static void imprimir(String texto) {
		
		for(int a=1; a<=10; a++) {
			System.out.println(texto + " - Página " + a);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
		}
	}
	
}

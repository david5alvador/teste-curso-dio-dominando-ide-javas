package semana05;

public class Impressao02 extends Thread {
	
	String texto = "Texto do Word 2";
	
	public void run() { // e executado ao iniciar a Thread
		Impressora.imprimir(texto);
		
}

}
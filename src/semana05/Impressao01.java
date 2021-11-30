package semana05;

public class Impressao01 extends Thread {
	
	String texto = "Texto do Word 1";
	
	public void run() { // e executado ao iniciar a Thread
		Impressora.imprimir(texto);
		
}

}
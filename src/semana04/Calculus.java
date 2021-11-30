package semana04;

public class Calculus {

	
	public static void somar(int a, int b) {
		int r = a + b;
		imprimir(r);
	}	
	public static void subtrair(int a, int b) {
		int r = a - b;
		imprimir(r);
	}
	public static void multiplicar(int a, int b) {
		int r = a * b;
		imprimir(r);
	}
	public static void dividir(int a, int b) {
		int r = a / b;
		imprimir(r);
	}
	
	private static void imprimir(int a) {
		System.out.println(a);
			
	}
}

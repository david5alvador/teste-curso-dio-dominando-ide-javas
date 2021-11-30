package semana07;

public class LeProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p = p.ler(10);
		if (p!=null) {
			System.out.println(p);
		}
		else {
			System.out.println("Objeto não encontrado");
		}
		//p.mostrar();
	}

}

package semana07;

public class UsaProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setCodigo(10);
		p1.setDescricao("Computador AT");
		p1.setPreco(2000);
		//p1.reajustar(-10);
		System.out.println(p1.gravar());
		
		
		//System.out.println(p1.getCodigo());
		
		//p1.mostrar();
		//System.out.println(p1);
		
		//Produto p2 = new Produto();
		Produto p2 = new Produto(20,"Sabonete",-1.79);
		
		System.out.println(p2);
		
		Produto p3 = new Produto(30,"Chocolate");
		System.out.println(p3);
	}

}

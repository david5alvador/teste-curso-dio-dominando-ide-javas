package semana07;

import javax.swing.JOptionPane;

public class GravaTxt {

	public static void main(String[] args) {
		
		
		for(int a=1; a<=1000; a++) {
			Produto p = new Produto(a,"Produto"+a,10);
			p.appendEmTxt();
		}
		//Produto p = new Produto(200,"mouse",30);
		//JOptionPane.showMessageDialog(null, p.toTxt());
		//JOptionPane.showMessageDialog(null, p.appendEmTxt());
	}

}

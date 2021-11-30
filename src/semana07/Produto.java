package semana07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Produto implements Serializable {

	
	private int codigo;
	private String descricao;
	private double preco;
	
	public void ler(String filename) {
		try {
			BufferedReader br = new BufferedReader (new FileReader(filename));
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.close();
		}
		catch(IOException erro) {
			System.out.println("Falha na leitura" + erro.getMessage());
		}
	}
	
	
	//transisentes, persistentes
	
	/**
	 * Grava em arquivo texto os dados do objeto corrente
	 * @return
	 */
	public String toTxt() {
		String men = "";
		
		
		try {
			PrintWriter pw = new PrintWriter(codigo+".txt");
			pw.println(codigo);
			pw.println(descricao);
			pw.println(preco);
			pw.close();
			men = "Objeto gravado com sucesso";
			
		}
		catch(IOException erro) {
			men = "Falha na gravação"+ erro.getMessage();
			
		}
		return men;
		
	}
	
	public String appendEmTxt() {
		String men = "";
		
		
		try {
			FileWriter pw = new FileWriter("produtos.txt",true);//abre se o arquivo exitir
			pw.append(codigo+";"+descricao+";"+preco+"\n");
			pw.close();
			men = "Objeto gravado com sucesso";
			
		}
		catch(IOException erro) {
			men = "Falha na gravação"+ erro.getMessage();
			
		}
		return men;
		
	}
	
	
	
	/**
	 * Persiste um objeto em disco
	 * @return - uma mensagem informando o resultado da gravação
	 */
	public String gravar() {
		String men = "";
		
		
		try {
			FileOutputStream fos = new FileOutputStream(new File(codigo+".obj"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this); //this irá corresponder ao objeto corrente
			oos.close();
			fos.close();
			men = "Objeto gravado com sucesso";
			
		}
		catch(IOException erro) {
			men = "Falha na gravação"+ erro.getMessage();
			
		}
		return men;
	}
	/**
	 * Realiza a leitura de um arquivo e devolve um objeto do tipo Produto
	 * @param codigo - o codigo do produto que sera lido
	 * @return - o objeto com o conteúdo do arquivo ou null caso o produto não exista
	 */
	public Produto ler(int codigo) {
		try {
			FileInputStream fis = new FileInputStream(new File(codigo+".obj"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Produto p = (Produto) ois.readObject();
			ois.close();
			fis.close();
			return p;
			
		}
		catch(Exception erro) {
			return null;
			
		}
		
	}
	
	/* 
	 * Elabore um método que recebe um valor percentual e aumenta o valor do produto
	 */
	
	public void reajustar(float percentual) {
		
		preco += preco*percentual/100;
		
	}
	
	public Produto() {//construtor default
		
	}
	
	
	
	
	public Produto(int codigo) {
		
		this.codigo = codigo;
	}

	
	



	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}




	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		setPreco(preco);
		
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco>=0) { //RN preco deve ser positivo
		this.preco = preco;
	}
	}
	
	public void mostrar() {
		System.out.println("["+codigo+","+descricao+","+preco+"]");
	}
	
	public String toString() { //devolve o estado do objeto
		return "["+codigo+","+descricao+","+preco+"]";
		
	}
}

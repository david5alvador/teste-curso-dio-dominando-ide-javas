package semana01;

public class Exemplo01 {

	public static void main(String[] args) {
		
		//byte a = 100;
		//double b = 3.456;
		//float f = (float)b;
		//int x = (int)b;
		
		if(args.length == 2) {
			
				int n1 = Integer.parseInt(args[0]);
				int n2 = Integer.parseInt(args[1]);
				System.out.println(n1+n2);
		}
		else {
			System.out.println("Forneça dos valores inteiros!");
		}
		
		//System.out.println(x);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[0]+args[1]);
		//System.out.println(n1+n2);
		
		
	}

}

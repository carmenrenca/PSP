package ejercicio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in) ;
		
			BufferedReader br = new BufferedReader (in);
			String a;
			String b;
			int suma;
			try {
				System.out.println("Introduce un numero ");
				a= br.readLine(); 
				
				System.out.println("Introduce otro");
				b=br.readLine();
				in.close();
				suma=(Integer.parseInt(a)+Integer.parseInt(b));
				
			System.out.println("la suma de los numero es "+suma);
				in.close();
				int exitVal;
				
			}catch(Exception e) {e.printStackTrace();}
		
	}

}

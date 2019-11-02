package ejercicio2_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MiHilo h= new MiHilo();
		h.start();
		BufferedReader l=new BufferedReader(new InputStreamReader(System.in));
		String valor;
		do {
			valor=l.readLine();
		
		if(valor.equalsIgnoreCase("s")) {
			h.Suspende();
		}else if(valor.equalsIgnoreCase("r")) {
			h.Reanuda();
		}else if(valor.equalsIgnoreCase("*")) {
		h.Finalizar(valor);
		}
		}while(valor!="*");	
			
	}

}

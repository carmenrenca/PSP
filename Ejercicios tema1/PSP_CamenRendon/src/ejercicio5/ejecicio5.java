package ejercicio5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ejecicio5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directorio = new File(".\\bin");
	
		ProcessBuilder pb = new ProcessBuilder ("java","LeerNombre","prueba");

		pb.directory(directorio);
		System.out.printf("Directorio de trabajo: %s ",pb.directory());
		Process p = pb.start();
		int valor;
		try {
			InputStream is = p.getErrorStream();
			int c;
			while((c= is.read())!=-1) {
				System.out.print((char) c);
				
			}
			is.close();
			valor=p.waitFor();
			System.out.println(valor);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

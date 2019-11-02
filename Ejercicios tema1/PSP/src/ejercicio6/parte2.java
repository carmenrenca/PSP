package ejercicio6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class parte2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
File directorio = new File(".\\bin");
ProcessBuilder pb = new ProcessBuilder("java","ejercicio6.Lectura");
pb.directory(directorio);
Process p = pb.start();
OutputStream os = p.getOutputStream();
os.write("6\n2\n".getBytes());
os.flush();
//preparo para leer el archivo
InputStream is = p.getInputStream();
int c;
while((c = is.read())!=-1) 
	System.out.print((char) c);
	is.close();
	
	int exitval;
	try {
		exitval=p.waitFor();
		System.out.println("valor de salida "+exitval);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}


	}

}

package ejercicio6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class parte2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//el proceso a ejecutar se encuetra en la carpeta bin, sera necesario crear un objeto file
		//que referencie a dicho directorio
	File directorio = new File(".\\bin");
	//creamos le proceso y le pasamos por parametro la clase a renderizar
	ProcessBuilder pb = new ProcessBuilder("java","ejercicio6.Lectura");
	//indicamos el directorio donde esta la clase
	pb.directory(directorio);
	//arrancamos ese proceso
	Process p = pb.start();
	//preparamos la salida
	OutputStream os = p.getOutputStream();
	//le pasamos los numero para la suma
	os.write("6\n2\n".getBytes());
	//limpiamos la secuencia de salida
	os.flush();
	//preparo para leer el archivo
	InputStream is = p.getInputStream();
	int c;
	//vamos imprimiendo por caracter la salida y cuando finalize cerramos el imput
	while((c = is.read())!=-1) 
		System.out.print((char) c);
		is.close();
		
		//si no hay error el waitFor nos dará un 0 en caso contrario un 1
		int exitval;
		try {
			exitval=p.waitFor();
			System.out.println("valor de salida "+exitval);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}

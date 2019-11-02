package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directorio=new File(".\\bin");
		//cogo los datos de el ejercicio 6
		ProcessBuilder pb = new ProcessBuilder("java","ejercicio6.Lectura");
		pb.directory(directorio);
		//creo bat para la entrada de datos 
		
	File fen = new File ("entrada.bat");
	//imprimo la salida en salida.txt
	File fsa = new File ("salida.txt");
	//y el error lo saco por error.txt
	File ferror= new File ("error.txt");
	
		
		pb.redirectInput(fen);
		pb.redirectOutput(fsa);
		pb.redirectError(ferror);
		
		 pb.start();
		 	
	}

}

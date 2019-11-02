package ejercicio8;

import java.io.File;
import java.io.IOException;

public class ejercicio8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directorio=new File(".\\bin");
		
		ProcessBuilder pb = new ProcessBuilder("CMD");
		pb.directory(directorio);
		//creo bat para la entrada de datos 
		
	File fen = new File ("entrada.bat");
	//imprimo la salida en salida.txt
	File fsa = new File ("salida.txt");
	//y el error lo saco por error.txt
	File ferror= new File ("error.txt");
	
		
		pb.redirectInput(ProcessBuilder.Redirect.from(fen));
		pb.redirectOutput(ProcessBuilder.Redirect.to(fsa));
		pb.redirectError(ProcessBuilder.Redirect.to(ferror));
		
		 pb.start();
	}

}

package EJERCICIO1HILO;

public class hilo extends Thread{

	public hilo(String Nombre) {
		super(Nombre);
		
	}
	public void run() {
		System.out.println("Hola Mundo "+getName());
	}
	
}

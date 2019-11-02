package Ejercicio2_7;

public class Hilos extends Thread{

	private contador cont;
	
	public Hilos (String n, contador c) {
		setName(n);
		this.cont=c;
	}
	
	public void run() {
		
		synchronized(cont) {
			
	
		for(int i=0; i<5000; i++) {
			cont.incrementa(); //incrementamos contador
		
		
	}
		System.out.println(getName()+" contador vale "+cont.valor());
		}
}
}

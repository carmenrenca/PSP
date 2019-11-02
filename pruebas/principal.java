package pruebas;

import java.util.Random;

public class principal implements Runnable {

	
	//como la variable es static cuando dos o más hilos intentan de incrementar	el valor de una variable estatica, se produce
	//indeterminación  
	
	
	//con Synchronized  evita que dos o más hilos escribam simultaneamente en la misma variable
	//con esto solamente puede acceder uno y el resto se espera 
	private  int id;
	private static Random cerrojo = new Random();
	private static int cont=0;
	
	public principal(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		synchronized(cerrojo){
		while(id != cont) {
			try {
				cerrojo.wait(); //mando a la cola los hilos
								//cueano un hilo se sale del synchronized los otros hilos se despertan automaticamente
								
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//pero en la cola del wait no pasa esto tenemos que despertalo nosotros manualmente con notifyAll()
		}
		System.out.println("Soy el hilo "+id);
		cont++;
		cerrojo.notifyAll();	
		}
	}
	
	public static void main(String[] args) {
		//esto lo que hace es que me devuelve cuantos hilos logicos tengo en la cpu
		Runtime runtime = Runtime.getRuntime();
		
		int nNucleos= runtime.availableProcessors();
		
		Thread[] hilos = new Thread[nNucleos];
		
		for(int i=0; i< hilos.length; i++) {
			Runnable runnable = new principal(i);
			hilos[i]= new Thread(runnable);
			hilos[i].start();
		}
		
		
		for(int i=0; i<hilos.length; i++) {
			try {
				hilos[i].join();
			}catch(Exception ex) {
				
			}
		}
		System.out.println("soy el hilo principal");

	}

	

}

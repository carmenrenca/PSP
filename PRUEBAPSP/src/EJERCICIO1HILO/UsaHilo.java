package EJERCICIO1HILO;

public class UsaHilo {

	public static void main(String[]args) {
		for(int i=0; i<5 ; i++) {
			hilo h =  new  hilo("Hilo"+i);
			h.start();
		}
	}
	
	
	
	
}

package Ejercicio2_1PINGPONG;

public class cola {
private String cadena;

private boolean disponible =false;

public synchronized String get() {
	while(!disponible) {
		try {
			wait();
		}catch(InterruptedException ex) {
			
		}
	
		
	}
	
	disponible=false;
	notify();
	return cadena;
}

public synchronized void put(String valor) {
	while(disponible) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.cadena=valor;
	this.disponible=true;
	notify();
}

}

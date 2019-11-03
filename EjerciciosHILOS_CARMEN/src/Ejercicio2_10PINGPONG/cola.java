package Ejercicio2_1PINGPONG;

public class cola {
private String cadena;


private boolean disponible =false;

public synchronized String get() {
	//cuando disponible es falso significa que la cola esta vacía y se quedara en espera
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

//cuando disponible sea true significará que la cola esta llena por lo tanto se quedara en espera hasta que le avisemos
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

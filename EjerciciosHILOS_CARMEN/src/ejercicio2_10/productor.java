package ejercicio2_10;

public class productor extends Thread {

	private cola cola;
	private int numero;
	
	public productor(cola c, int n) {
		this.cola=c;
		this.numero=n;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			cola.put(i);
			System.out.println(i+"=> El productor "+numero+" ha producido: "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	//si quitaramos el sleep lo que pasar�a es que el productor va m�s rapido que el consumidor por lo tanto
	//da lugar a que el comsumidor se salte alg�n numero de la cola , y si el sleep lo ponemos en el consum
}

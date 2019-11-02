package ejercicio2_9;

public class consumidor extends Thread {

	private cola cola;
	private int  numero;
	
	public consumidor(cola c, int n) {
		this.cola=c;
		this.numero=n;
		
	}
	
	public void run() {
		int valor=0;
		for(int i =0; i<5; i++) {
			valor= cola.get();
			try {
				sleep(190);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("El consumidor "+numero+"ha condumido "+valor);
		}
	}
	
}

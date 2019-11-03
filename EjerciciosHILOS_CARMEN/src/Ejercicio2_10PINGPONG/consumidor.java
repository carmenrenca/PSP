package Ejercicio2_1PINGPONG;

public class consumidor extends Thread {

	private cola cola;
	private int  numero;
	
	public consumidor(cola c, int n) {
		this.cola=c;
		this.numero=n;
		
	}
	
	public void run() {
		String valor="";
		while(true) {
			valor= cola.get();
		
			System.out.println(valor);
		}
	
	}
	
}

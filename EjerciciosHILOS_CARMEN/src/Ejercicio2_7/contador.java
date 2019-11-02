package Ejercicio2_7;

public class contador {
	
	private int c=0;
	contador(int c){
		this.c=0;
	}
	public synchronized void incrementa() {
		c= c+1;
	}
	
	public  synchronized  int valor() {
		return c;
	}
}

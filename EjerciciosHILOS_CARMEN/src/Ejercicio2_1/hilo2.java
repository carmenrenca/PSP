package Ejercicio2_1;

public class hilo2 extends Thread {
	
	public void run() {
		while(true) {
			 System.out.println("TAC");
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}

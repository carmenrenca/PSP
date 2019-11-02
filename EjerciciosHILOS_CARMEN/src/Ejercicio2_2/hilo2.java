package Ejercicio2_2;

public class hilo2 implements Runnable {

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

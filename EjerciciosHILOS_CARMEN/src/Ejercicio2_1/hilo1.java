package Ejercicio2_1;

public class hilo1 extends Thread {


	
	public void run() {
		while(true) {
			 System.out.println("TIC");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}

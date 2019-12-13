package ejercicio2_3;


public class SolicitaSuspender {
	private boolean suspender;
	

	
	public synchronized void set (boolean b) {
		suspender=b;
		
		notify();
	}
	
	
	

	public synchronized void esperandoParaReanudar() throws InterruptedException {
		
		while(suspender==true) {
			wait();
		}
	}
	
	
	
	

}

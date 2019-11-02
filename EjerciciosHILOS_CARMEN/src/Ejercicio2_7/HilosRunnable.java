package Ejercicio2_7;

public class HilosRunnable implements Runnable {
	private contador cont;
	private String name;
	
	public HilosRunnable (String n, contador c) {
		this.name=n;
		this.cont=c;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void run() {
		synchronized(cont) {
			
			
			for(int i=0; i<5000; i++) {
				cont.incrementa(); //incrementamos contador
			
			
		}
			System.out.println(getName()+" contador vale "+cont.valor());
			}
		
	}

}

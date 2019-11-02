package ejercicio2_6;

public class Hiloprioridad extends Thread {
private int c=0;
private boolean stopHilo=false;

public Hiloprioridad(String n) {
	super(n);
}

public int getcontador() {
	return c;
}

public void pararhilo() {
	stopHilo=true;
}
public void run() {
	while(stopHilo==false) {
	
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	c++;
	}
	System.out.println("Fin Hilo: "+this.getName());
}
}

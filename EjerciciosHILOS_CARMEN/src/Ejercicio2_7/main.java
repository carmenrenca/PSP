package Ejercicio2_7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contador cont = new contador(0);
		Hilos h1 = new Hilos("Hilo1", cont);
		Hilos h2 = new Hilos("Hilo2", cont);
		Hilos h3 = new Hilos("Hilo3", cont);
		Hilos h4 = new Hilos("Hilo4", cont);
		Hilos h5 = new Hilos("Hilo5", cont);
		
		HilosRunnable h6 = new HilosRunnable ("Hilo6", cont);
		HilosRunnable h7 = new HilosRunnable ("Hilo7", cont);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		//////
		h6.run();
		h7.run();
	}

}

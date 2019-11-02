package Ejercicio2_2;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

int i=1;
hilo1 h1 = new hilo1();
hilo2 h2 = new hilo2();
new Thread(h1).start();
new Thread(h2).start();
		
		

	}

}

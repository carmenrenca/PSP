package Ejercicio2_1PINGPONG;

public class ProductorPINPONG extends Thread {
	private cola cola;
	private int numero;
	
	public ProductorPINPONG(cola c, int n) {
		this.cola=c;
		this.numero=n;
	}
	
	public void run() {
	//creamos un contador y cuando salga par guardará PING y cuando no PONG
		int n=0;
	while(true) {
		n++;
		if(n%2==0) {
			cola.put("PING");
			
			
		}else {
			cola.put("PONG");
		}
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

		
		
	}
}

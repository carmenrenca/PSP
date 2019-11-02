package ejerccio2_8;



public class Hilos extends Thread {
	private Saldo saldo;
	String nombre;

	public Hilos(String n, Saldo s) {
		setName(n);
		this.saldo=s;
	}

	public void run() {
		for(int i=1; i<4; i++) {
			saldo.añadirsaldo(getName(), 10);
		}
	}
}

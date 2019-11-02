package ejerccio2_8;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Saldo s = new Saldo(100);
System.out.println("Saldo inicial "+s.getSaldo());

Hilos h1 = new Hilos("Hilo1",s);

Hilos h2 = new Hilos("Hilo2",s);

Hilos h3 = new Hilos("Hilo3",s);
Hilos h4 = new Hilos("Hilo4",s);

h1.start();
h2.start();
h3.start();
h4.start();



	}

}

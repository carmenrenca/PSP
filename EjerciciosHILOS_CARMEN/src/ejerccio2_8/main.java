package ejerccio2_8;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un objeto saldo común para todos los hilos, la cuenta en un principio cuenta con 100€
Saldo s = new Saldo(100);
System.out.println("SALDO INICIAL"+s.getSaldo());

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

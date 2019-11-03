package ejerccio2_8;


		
		public class Hilos extends Thread {
			private Saldo saldo;
			String nombre;
		
			public Hilos(String n, Saldo s) {
				setName(n);
				this.saldo=s;
			}
		//llamamos al metodo añadir saldo y le añadiremos 10 por cada iteración 
			public void run() {
				for(int i=1; i<4; i++) {
					saldo.añadirsaldo(getName(), 10);
				}
			}
		}

package ejerccio2_8;


		
		public class Hilos extends Thread {
			private Saldo saldo;
			String nombre;
		
			public Hilos(String n, Saldo s) {
				setName(n);
				this.saldo=s;
			}
		//llamamos al metodo a�adir saldo y le a�adiremos 10 por cada iteraci�n 
			public void run() {
				for(int i=1; i<4; i++) {
					saldo.a�adirsaldo(getName(), 10);
				}
			}
		}

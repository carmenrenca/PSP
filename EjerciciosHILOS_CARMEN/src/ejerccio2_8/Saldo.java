package ejerccio2_8;

public class Saldo {

	int saldo;
	
	public Saldo(int c) {
		this.saldo=c;
	}
//metodo para devolver la cantidad de saldo disponible
	public int getSaldo() {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saldo;
	}

	
	public void setSaldo(int s) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.saldo =  saldo+s;
	}
	
	
	//metodo en el que vamos a añadir una cantidad a el saldo total llamando a setSaldo()
	//primero mostramos la cantidad que se dispone antes de la operación y al final la cantidad con el ingreso
	
	public synchronized void añadirsaldo(String n, int c) {
		System.out.println("Su cantidad actual en la cuenta es de "+this.getSaldo());
		System.out.println(n+" va a realizar un ingreso de "+c+"€");
		this.setSaldo(c);
	
		
		System.out.println(n+" Dispone en la cuenta de "+this.getSaldo());
	}
	
	
	
}

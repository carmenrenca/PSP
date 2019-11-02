package Ejercicio2_1PINGPONG;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cola c = new cola();
		ProductorPINPONG p = new ProductorPINPONG (c, 1);
		consumidor  con= new consumidor(c, 1);
		
		p.start();
		con.start();

		
	}

}

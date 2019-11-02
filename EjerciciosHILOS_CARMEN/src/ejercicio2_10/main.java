package ejercicio2_10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cola c = new cola();
		productor p = new productor (c, 1);
		consumidor  con= new consumidor(c, 1);
		consumidor2 con2= new consumidor2(c,2);
		p.start();
		con.start();
		con2.start();
		
	}

}

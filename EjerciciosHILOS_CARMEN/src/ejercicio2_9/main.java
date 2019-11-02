package ejercicio2_9;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cola c = new cola();
		productor p = new productor (c, 1);
		consumidor  con= new consumidor(c, 2);
		
		p.start();
		con.start();
		
	}

}

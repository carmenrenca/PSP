package ejercicio2_6;

public class EjemploHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hiloprioridad h1= new Hiloprioridad("Hilo1");
		Hiloprioridad h2= new Hiloprioridad("Hilo2");
		Hiloprioridad h3= new Hiloprioridad("Hilo3");
		Hiloprioridad h4= new Hiloprioridad("Hilo4");
		Hiloprioridad h7= new Hiloprioridad("Hilo7");
		
		h1.setPriority(Thread.MIN_PRIORITY);
		h2.setPriority(Thread.NORM_PRIORITY);
		h3.setPriority(Thread.MAX_PRIORITY);
		h4.setPriority(4);
		h7.setPriority(7);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h7.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h1.pararhilo();
		h2.pararhilo();
		h3.pararhilo();
		h4.pararhilo();
		h7.pararhilo();
		
		
		System.out.println("h3 (Prioridad Maxima): "+h3.getcontador());
		System.out.println("h7 (Prioridad 7): "+h7.getcontador());
		System.out.println("h2 (Prioridad Normal): "+h2.getcontador());
		System.out.println("h4 (Prioridad 4): "+h4.getcontador());
		System.out.println("h1 (Prioridad Minima): "+h1.getcontador());
	
	
	

		
	}

}

package filosofos;

public class Filosofos extends Thread{
private int id;

private Tenedor izda, drcha;
private Silla silla;
public Filosofos(int id, Tenedor izda, Tenedor dcha, Silla s) {
	this.id= id;
	this.izda=izda;
	this.drcha=dcha;
	this.silla=s;
	
}

public void run() {
	 while(true) {
		 silla.cogersilla(id);
		 izda.cogerTenedor(id);
		 this.drcha.cogerTenedor(id);
		 //hemos cogido los dos tenedores por lo tanto ya puede empezar a comer 
		 try {
			sleep(1050);
			System.out.println("FILÓSOFO "+id+" COMIENDO");
			sleep(1050);
		} catch (InterruptedException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 this.drcha.soltartenedor(id);
		 this.izda.soltartenedor(id);
		 silla.soltarsilla(id);
		 //soltamos los tenedores y la silla, el filósigo se queda pensando hasta que  vuelva a comer
		 System.out.println("FILÓSOFO "+id+" PENSANDO");
		 try {
			sleep(1050);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 
		 
		 
	 }
}

}

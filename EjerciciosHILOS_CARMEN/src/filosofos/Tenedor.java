package filosofos;

public class Tenedor {

	private int id;
	
	private boolean libre= true;
	
	public Tenedor(int id) {
		this.id=id;
	}
	
	public synchronized void cogerTenedor(int i) {
		while(!libre) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Filósofo "+i+ " Coge tenedor "+id);
			libre=false;
		
		
	}
	
	public synchronized void soltartenedor(int i) {
		libre= true;
		System.out.println("Filosodo "+i+" Suelta el tenedor "+id);
		notify();
	}
	
}

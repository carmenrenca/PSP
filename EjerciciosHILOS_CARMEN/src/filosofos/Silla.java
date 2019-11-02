package filosofos;

public class Silla {
//creamos 4 sillas esto lo hacemos para asegurar que al menos un fil�sofo pueda comer si o si
	//ya que al sacar fuera uno de ellos sobran dos tenedores
	private int sLibre= 4;
	public Silla() {
		
	}
	//al pricipio el filosofo coge uni silla en el que caso que haya disponible
	
	public synchronized void cogersilla(int i) {
		while(sLibre==0) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fil�sofo "+i+" coge una silla");
		sLibre--; 
		
	}
	
	//cuando termine de comer soltar� la silla y la dejar� disponible para el siguiente
	
	public synchronized void soltarsilla(int i) {
		sLibre++;
		
		System.out.println("Filosofo "+i+" Suelta una silla");
		notify();
	}
}

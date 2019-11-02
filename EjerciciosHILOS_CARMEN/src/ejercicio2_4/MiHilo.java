package ejercicio2_4;

public class MiHilo extends Thread {
  public static 	int cont=0;
	private SolicitaSuspender s = new SolicitaSuspender();
	public boolean v;
	public String controla ;
	public void Suspende() {
		s.set(true);
	}
	
	public void Reanuda() {
		s.set(false);
	}

	public void Finalizar(String valor) {
		this.controla="*";
	}

	public boolean isV() {
		return v;
	}

	public void setV(boolean v) {
		this.v = v;
	}
	
	
	public String getControla() {
		return controla;
	}

	public void setControla(String controla) {
		this.controla = controla;
	}

	public void run() {
	
while(controla!="*") {

	try {
		cont++;
		System.out.println(cont);
		s.esperandoParaReanudar();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		System.out.println("FIN");	
		
	}
	
	
	
}

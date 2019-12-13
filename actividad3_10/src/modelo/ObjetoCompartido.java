package modelo;

public class ObjetoCompartido {

	private int numero;
	private boolean acabo;
	private int ganador;
	
	public ObjetoCompartido(int numero) {
		this.numero=numero;
		this.acabo=false;
	}
	
	public boolean seAcabo() {
		return acabo;
	}

	public int getGanador() {
		return ganador;
	}
	
	public synchronized String nuevaJugada(int Jugador, int suNumero) {
		String cad="";
		
		if(!seAcabo()) {
			if(suNumero > numero) {
			cad="Numero demasiado grande";
			}else if(suNumero< numero ) {
				cad="Numero demasido peque�o";
			}else if(suNumero==numero) {
				cad="gana adivino el numero";
				acabo=true;
				ganador=Jugador;
			}
			
			
		}else {
			cad="Jugador "+ganador+" adivino el numero: "+numero;
			
			
		}
		return cad;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

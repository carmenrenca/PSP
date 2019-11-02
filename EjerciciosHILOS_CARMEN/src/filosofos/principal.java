package filosofos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tenedor[] tenedores = new Tenedor[5];
		Silla s = new Silla();
		//creo los 5 tenedores
		for(int i=0; i<tenedores.length; i++) {
			tenedores[i]= new Tenedor(i);
		}
		
		//creo un array con mis cinco filosofos
		Filosofos[] filosofo = new Filosofos[5];
		
	
		for(int i=0; i<filosofo.length; i++) {
			//creamos el objeto pasandole el id de ese filósofo, los id de los dos tenedores y el objeto silla
			filosofo[i]= new Filosofos(i, tenedores[i], tenedores[(i+1)%5],s);
		}
		
		//arrancamos los hilos
		
		for(int i=0; i<filosofo.length; i++) {
			
			filosofo[i].start();
		}
		
	}

}

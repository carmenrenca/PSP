package ejercicio2_9;

public class cola {
private int numero;

private boolean disponible =false;

public int get() {
	if(disponible) {
		disponible=false;
		return numero;
	}
	return -1;
}

public void put(int valor) {
	this.numero=valor;
	this.disponible=true;
}

}

package ejercicio4;

public class LeerNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(String palabra: args) {
			System.out.println(palabra);
			if(palabra.equalsIgnoreCase("prueba")) {
		System.exit(0);
			}else {
				System.exit(-1);	
			}
		}
		
	}

}

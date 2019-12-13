/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

/**
 *
 * @author Carmen
 */
public class cliente {
    String cadena;
    int identificador;
     ObjectInputStream fentrada;
     ObjectOutputStream fsalida;
     Datos datos;
       public cliente() throws IOException{
           this.identificador=0;
           this.cadena="";
     	String host="localhost";
			int puerto=6001;
			Socket cliente=new Socket(host,puerto);
			 fsalida= new ObjectOutputStream(cliente.getOutputStream());
			 fentrada= new ObjectInputStream(cliente.getInputStream());
   }
       
       public void jugada() throws IOException, ClassNotFoundException{
         Datos datos=(Datos) fentrada.readObject();
			identificador=datos.getIdentificador();
			System.out.println("Id jugador: "+identificador);
			System.out.println(datos.getCadena());
                        
		if(!datos.isJuega())
			cadena="*";
       }
       
       public void numero(String cadena) throws IOException, ClassNotFoundException{
           Datos d=new Datos();
           	d.setCadena(cadena);
				
				fsalida.reset();
				fsalida.writeObject(d);
				
				 datos=(Datos) fentrada.readObject();
				System.out.println("\t"+datos.getCadena());
                               this.cadena=datos.getCadena();
                               
       }
       
       
		private static boolean validarCadena(String cadena) {
			boolean valor=false;
			try {
				Integer.parseInt(cadena);
				valor=true;
			}catch (NumberFormatException e) {
				// TODO: handle exception
			}
			return valor;
		}
  
                
	public Datos getDatos() {
		
            return datos;
                
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}
           
            public int getIdentificador() {
                            return identificador;
                    }
          
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
        
        
        public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
      
      	
	
    
}

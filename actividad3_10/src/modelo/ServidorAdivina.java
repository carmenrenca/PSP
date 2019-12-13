/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carmen
 */
public class ServidorAdivina {
    	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			ServerSocket servidor= new ServerSocket(6001);
			System.out.println("Servidor Iniciado...");
			
			//Numero a adivinar entre 1 y 25 
			
			int numero =(int ) (1+25*Math.random());
			System.out.println("Numero a adivinar => "+numero);
			
			ObjetoCompartido objeto= new ObjetoCompartido(numero);
			int id=0;
			
			while(true) {
				Socket cliente = new Socket();
				cliente= servidor.accept();
				id++;
				HiloServidorAdivina hilo= new HiloServidorAdivina(cliente, objeto, id);
				hilo.start();
			}
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3_10;

import controlador.controladorCliente;
import java.io.IOException;
import modelo.cliente;
import vista.view;

/**
 *
 * @author Carmen
 */
public class Actividad3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         new controladorCliente(new view(),new cliente()).iniciar();
    }
    
}

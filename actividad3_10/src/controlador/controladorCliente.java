/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.cliente;
import vista.view;

/**
 *
 * @author Carmen
 */
public class controladorCliente  implements ActionListener, MouseListener{
    public view vista;
    public cliente cliente;
public enum AccionMVC {
		__Enviar}
	
	 public  controladorCliente(view vista, cliente c){
        this.vista=vista;
        this.cliente=c;
    }

   
public void iniciar() throws IOException, ClassNotFoundException{
   
     vista.setVisible(true);
		this.vista.Enviar.setActionCommand("__Enviar");
                this.vista.Enviar.addActionListener(this);
                
                cliente.jugada();
                this.vista.IDcliente.setText(Integer.toString(cliente.getIdentificador()));
                this.vista.intentos.setText("0");
                this.vista.mensajeadivina.setText("Adivina un numero entre 1 y 25");
		
                
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
            switch (AccionMVC.valueOf(e.getActionCommand())) {
                case __Enviar:
                    if(cliente.getIdentificador()>5){
                        JOptionPane.showMessageDialog(null, "Ha alcanzado el maximo numero de intentos");
                    }else{
                        try{
                            cliente.numero(this.vista.Num.getText());
                            this.vista.mensajeadivina.setText(cliente.getCadena());
                            this.vista.intentos.setText(Integer.toString(cliente.getDatos().getIntentos()));
                        } catch (IOException ex) {
                    Logger.getLogger(controladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(controladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
                break;
            }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

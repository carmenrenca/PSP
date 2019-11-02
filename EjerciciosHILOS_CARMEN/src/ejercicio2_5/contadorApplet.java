package ejercicio2_5;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class contadorApplet extends Applet implements ActionListener {


	

	private boolean parar1=false;
	private Font fuente;
	int n1, n2;
	private Button b1,b2;


	
	class HiloContenedor extends Thread{
		
		long contador;
		
		public HiloContenedor(long n) {
			this.contador=n;
		}
		
	
		
	
		public void run() {
	while(parar1==false) {
				
					try {
						
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
					contador++;				
			
			}
	
			
		}


		public long getContador() {
			return contador;
		}


	
		
	}

	
	HiloContenedor h1 = new HiloContenedor(30);
	HiloContenedor h2 = new HiloContenedor(50);

	public void start() {
		h1.start();
		h2.start();
	}
public void init() {
	setBackground(Color.yellow);
	add(b1=new Button("Finalizar Hilo 1"));
	b1.addActionListener(this);
	add(b2=new Button("Finalizar Hilo 2"));
	b2.addActionListener(this);
	fuente= new Font ("Verdana", Font.BOLD,26);
	
}



public void paint (Graphics g) {
	g.clearRect(0, 0, 400, 400);
	g.setFont(fuente);
	g.drawString("Hilo1: "+Long.toString((long)h1.getContador()), 80, 100);
	g.drawString("Hilo2: "+Long.toString((long)h2.getContador()), 80, 170);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
	
	h1.stop();
	}else if(e.getSource()==b2) {

		h2.stop();
	}
}


public void stop() {
	h1=null;
	h2=null;
}



}

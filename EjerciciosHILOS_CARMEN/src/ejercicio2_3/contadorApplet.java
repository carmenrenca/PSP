package ejercicio2_3;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.beancontext.BeanContext;



public class contadorApplet extends Applet implements ActionListener {


	

	private boolean parar1=false;
	private Font fuente;
	int n1, n2;
	private Button b1,b2,b3,b4,b5;

	SolicitaSuspender s = new SolicitaSuspender();
	
	class HiloContenedor extends Thread{
        pausar=false;

		long contador;
		
		public HiloContenedor(long n) {
			this.contador=n;
		}
		
	
		
	
		public void run() {
	while(!isInterrupted()) {
				
					try {
						
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						Thread.currentThread().interrupt();
						System.out.println("Ha ocurrido una excepcion");
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

	
public void init() {
	setBackground(Color.yellow);
	add(b1=new Button("comenzar proceso"));
	b1.addActionListener(this);
	add(b2=new Button("suspender hilo1"));
	b2.addActionListener(this);
	add(b3=new Button("reanudar hilo1"));
	b3.addActionListener(this);
	add(b4=new Button("suspender hilo2"));
	b4.addActionListener(this);
	add(b5=new Button("reanudar hilo2"));
	b5.addActionListener(this);
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

	h1.start();
	h2.start();
	}else if(e.getSource()==b2) {

		h1.interrupt();
		try {
			s.esperandoParaReanudar();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(e.getSource()==b4){
		h2.interrupt();
		
		try {
			s.esperandoParaReanudar();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(e.getSource()==b5) {
		s.set(false);

	}
}







}

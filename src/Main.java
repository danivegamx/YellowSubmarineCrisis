/** SUBMARINE CRISIS v1.0 JAVA 
	Developed by: Dani Vega
	Graficación ITJ         **/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.net.*;

public class Main extends JPanel implements KeyListener
{
	private static final long serialVersionUID = 1L;
	JFrame ventana;
	Image fondo;
	Container cont;
	DaniCruzier obd = new DaniCruzier();
	Mantarraya arrobm[];
	Mantarraya obm1 = new Mantarraya(800,500,3);Mantarraya obm19 = new Mantarraya(800,500,3);
	Mantarraya obm2 = new Mantarraya(800,500,3);Mantarraya obm11 = new Mantarraya(800,500,3);
	Mantarraya obm3 = new Mantarraya(800,500,3);Mantarraya obm12 = new Mantarraya(800,500,3);
	Mantarraya obm4 = new Mantarraya(800,500,3);Mantarraya obm13 = new Mantarraya(800,500,3);
	Mantarraya obm5 = new Mantarraya(800,500,3);Mantarraya obm14 = new Mantarraya(800,500,3);
	Mantarraya obm6 = new Mantarraya(800,500,3);Mantarraya obm15 = new Mantarraya(800,500,3);
	Mantarraya obm7 = new Mantarraya(800,500,3);Mantarraya obm16 = new Mantarraya(800,500,3);
	Mantarraya obm8 = new Mantarraya(800,500,3);Mantarraya obm17 = new Mantarraya(800,500,3);
	Mantarraya obm9 = new Mantarraya(800,500,3);Mantarraya obm18 = new Mantarraya(800,500,3);
	Mantarraya obm10 = new Mantarraya(800,500,3);Mantarraya obm20 = new Mantarraya(800,500,3);
	static String player;
	BufferedImage buf;
	JLabel lplayer, lscore,llife;
	JProgressBar life;
	long milis = 70;
	int tiempo, nlife = 100, score=0;
	boolean muerto = false,ayuda=false;
	Random obr = new Random();
	
	public Main(String tit)
	{
		ventana = new JFrame(tit);
		cont = ventana.getContentPane();
		ventana.setSize(800, 500);
		cont.setLayout(new BorderLayout());
		cont.add(this,BorderLayout.CENTER);
		arrobm = new Mantarraya[20];
		for (int i = 0; i < arrobm.length; i++) 
		{
			arrobm[i] = new Mantarraya(800,500,3);
		}
		lplayer = new JLabel(player);
			lplayer.setForeground(Color.white);
			lplayer.setBounds(10, 10, 300, 100);
			lplayer.setText("Jugador: "+player);
		llife = new JLabel("                            Salud: ");
		life = new JProgressBar(0,100);
		lscore = new JLabel();
			lscore.setForeground(Color.white);
		add(lplayer);add(llife);add(life);add(lscore);
		
		ventana.addKeyListener(this);
		buf = loadImage("/Resources/fondo.jpg");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	public void Animar()
	{
		while(ventana.isVisible())
		{	
			obd.Avanzar();
			
			obm1.Avanzar();obm12.Avanzar();
			obm2.Avanzar();obm13.Avanzar();
			obm3.Avanzar();obm15.Avanzar();
			obm4.Avanzar();obm16.Avanzar();
			obm5.Avanzar();obm17.Avanzar();
			obm6.Avanzar();obm18.Avanzar();
			obm7.Avanzar();obm19.Avanzar();
			obm8.Avanzar();obm20.Avanzar();
			obm9.Avanzar();obm10.Avanzar();
			
			try
			{
				Thread.sleep(milis);
				tiempo++;
			}
			catch(InterruptedException e){}
			repaint();
			
			if(tiempo == (milis*4))
			{
				obd.vel+=3;
				tiempo = 0;
			}
			if(muerto == true)
			{
				JOptionPane.showMessageDialog(ventana, "¡Tu salud se ha agotado! GAME OVER ):");
				muerto = false;
				// Reiniciamos las variables.
				obd.x = obr.nextInt(600); obd.y = obr.nextInt(400); obd.vel = 5; obd.sent = obr.nextInt(3); tiempo = 0; nlife=100;
				obm1 = new Mantarraya(800,500,3);obm19 = new Mantarraya(800,500,3);
				obm2 = new Mantarraya(800,500,3);obm11 = new Mantarraya(800,500,3);
				obm3 = new Mantarraya(800,500,3);obm12 = new Mantarraya(800,500,3);
				obm4 = new Mantarraya(800,500,3);obm13 = new Mantarraya(800,500,3);
				obm5 = new Mantarraya(800,500,3);obm14 = new Mantarraya(800,500,3);
				obm6 = new Mantarraya(800,500,3);obm15 = new Mantarraya(800,500,3);
				obm7 = new Mantarraya(800,500,3);obm16 = new Mantarraya(800,500,3);
				obm8 = new Mantarraya(800,500,3);obm17 = new Mantarraya(800,500,3);
				obm9 = new Mantarraya(800,500,3);obm18 = new Mantarraya(800,500,3);
				obm10 = new Mantarraya(800,500,3);obm20 = new Mantarraya(800,500,3);
			}
			if(obd.gameover == true)
			{
				JOptionPane.showMessageDialog(ventana, "¡Has chocado! GAME OVER ):");
				obd.gameover = false;
				// Reiniciamos las variables.
				obd.x = obr.nextInt(600); obd.y = obr.nextInt(400); obd.vel = 5; obd.sent = obr.nextInt(3); tiempo = 0;
				obm1 = new Mantarraya(800,500,3);obm19 = new Mantarraya(800,500,3);
				obm2 = new Mantarraya(800,500,3);obm11 = new Mantarraya(800,500,3);
				obm3 = new Mantarraya(800,500,3);obm12 = new Mantarraya(800,500,3);
				obm4 = new Mantarraya(800,500,3);obm13 = new Mantarraya(800,500,3);
				obm5 = new Mantarraya(800,500,3);obm14 = new Mantarraya(800,500,3);
				obm6 = new Mantarraya(800,500,3);obm15 = new Mantarraya(800,500,3);
				obm7 = new Mantarraya(800,500,3);obm16 = new Mantarraya(800,500,3);
				obm8 = new Mantarraya(800,500,3);obm17 = new Mantarraya(800,500,3);
				obm9 = new Mantarraya(800,500,3);obm18 = new Mantarraya(800,500,3);
				obm10 = new Mantarraya(800,500,3);obm20 = new Mantarraya(800,500,3);
			}
		}
	}
	
	public BufferedImage loadImage(String nombre) 
	{
        URL url = null;
        try 
        {
        	url = getClass().getResource(nombre);
        	return ImageIO.read(url);

        } 
        catch (Exception e) 
        {
        	System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
        	System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
        	return null; 
        }
     }
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(buf, 0, 0, this);
		// Dibujar submarino:
		obd.Pintar(g);
		
		// Dibujar mantarrayas:
		obm1.Pintar(g);obm11.Pintar(g);
		obm2.Pintar(g);obm12.Pintar(g);
		obm3.Pintar(g);obm13.Pintar(g);
		obm4.Pintar(g);obm14.Pintar(g);
		obm5.Pintar(g);obm15.Pintar(g);
		obm6.Pintar(g);obm16.Pintar(g);
		obm7.Pintar(g);obm17.Pintar(g);
		obm8.Pintar(g);obm18.Pintar(g);
		obm9.Pintar(g);obm19.Pintar(g);
		obm10.Pintar(g);obm20.Pintar(g);
		g.setFont(new Font("Calibri",Font.ITALIC,11));
		g.drawString("Para obtener ayuda, presiona F1...", 610, 450);
		
		try {
			ControlarColisiones();
		} catch (Exception e) {}
		
		try {
			ControlarScore();
		} catch (Exception e) {}
		
		lscore.setText("                              Puntuación: "+score+ " pts.");
		life.setValue(nlife);
		if(nlife == 0)
			muerto = true;
	}
	
	public static void main(String[] args)
	{
		new Initial_Loader();
		player = JOptionPane.showInputDialog("Ingrese el nombre de jugador:");
		new Main("Submarine Crisis ver1.0").Animar();
	}

	public void ControlarColisiones() throws Exception
	{
		
					if(obm1.Checar().intersects(obd.Checar()) == true)
					{
						obm1.x = 800;
						nlife-=10;
					}
					
					if(obm2.Checar().intersects(obd.Checar()) == true)
					{
						obm2.x = 800;
						nlife-=10;
					}
					
					if(obm3.Checar().intersects(obd.Checar()) == true)
					{
						obm3.x = 800;
						nlife-=10;
					}
					
					if(obm4.Checar().intersects(obd.Checar()) == true)
					{
						obm4.x = 800;
						nlife-=10;
					}
					
					if(obm5.Checar().intersects(obd.Checar()) == true)
					{
						obm5.x = 800;
						nlife-=10;
					}
					
					if(obm6.Checar().intersects(obd.Checar()) == true)
					{
						obm6.x = 800;
						nlife-=10;
					}
					
					if(obm7.Checar().intersects(obd.Checar()) == true)
					{
						obm7.x = 800;
						nlife-=10;
					}
					
					if(obm8.Checar().intersects(obd.Checar()) == true)
					{
						obm8.x = 800;
						nlife-=10;
					}
					
					if(obm9.Checar().intersects(obd.Checar()) == true)
					{
						obm9.x = 800;
						nlife-=10;
					}
					
					if(obm10.Checar().intersects(obd.Checar()) == true)
					{
						obm10.x = 800;
						nlife-=10;
					}
					
					if(obm11.Checar().intersects(obd.Checar()) == true)
					{
						obm11.x = 800;
						nlife-=10;
					}
					
					if(obm12.Checar().intersects(obd.Checar()) == true)
					{
						obm12.x = 800;
						nlife-=10;
					}
				
					if(obm13.Checar().intersects(obd.Checar()) == true)
					{
						obm13.x = 800;
						nlife-=10;
					}
					
					if(obm14.Checar().intersects(obd.Checar()) == true)
					{
						obm14.x = 800;
						nlife-=10;
					}
					
					if(obm15.Checar().intersects(obd.Checar()) == true)
					{
						obm15.x = 800;
						nlife-=10;
					}
					
					if(obm16.Checar().intersects(obd.Checar()) == true)
					{
						obm16.x = 800;
						nlife-=10;
					}
					
					if(obm17.Checar().intersects(obd.Checar()) == true)
					{
						obm17.x = 800;
						nlife-=10;
					}
					
					if(obm18.Checar().intersects(obd.Checar()) == true)
					{
						obm18.x = 800;
						nlife-=10;
					}
					
					if(obm19.Checar().intersects(obd.Checar()) == true)
					{
						obm19.x = 800;
						nlife-=10;
					}
					
					if(obm20.Checar().intersects(obd.Checar()) == true)
					{
						obm20.x = 800;
						nlife-=10;
					}
	}
	
	public void ControlarScore() throws Exception
	{
		if(obm1.x==0)
		{
			obm1.x=800;
			obm1.y=obr.nextInt(400);
			score++;
		}else
		if(obm2.x==0)
		{
			obm2.x=800;
			obm2.y=obr.nextInt(400);
			score++;
		}else
		if(obm3.x==0)
		{
			obm3.x=800;
			obm3.y=obr.nextInt(400);
			score++;
		}else
		if(obm4.x==0)
		{
			obm4.x=800;
			obm4.y=obr.nextInt(400);
			score++;
		}else
		if(obm5.x==0)
		{
			obm5.x=800;
			obm5.y=obr.nextInt(400);
			score++;
		}else
		if(obm6.x==0)
		{
			obm6.x=800;
			obm6.y=obr.nextInt(400);
			score++;
		}else
		if(obm7.x==0)
		{
			obm7.x=800;
			obm7.y=obr.nextInt(400);
			score++;
		}else
		if(obm8.x==0)
		{
			obm8.x=800;
			obm8.y=obr.nextInt(400);
			score++;
		}else
		if(obm9.x==0)
		{
			obm9.x=800;
			obm9.y=obr.nextInt(400);
			score++;
		}else
		if(obm10.x==0)
		{
			obm10.x=800;
			obm10.y=obr.nextInt(400);
			score++;
		}else
		if(obm11.x==0)
		{
			obm11.x=800;
			obm11.y=obr.nextInt(400);
			score++;
		}else
		if(obm12.x==0)
		{
			obm12.x=800;
			obm12.y=obr.nextInt(400);
			score++;
		}else
		if(obm13.x==0)
		{
			obm13.x=800;
			obm13.y=obr.nextInt(400);
			score++;
		}else
		if(obm14.x==0)
		{
			obm14.x=800;
			obm14.y=obr.nextInt(400);
			score++;
		}else
		if(obm15.x==0)
		{
			obm15.x=800;
			obm15.y=obr.nextInt(400);
			score++;
		}else
		if(obm16.x==0)
		{
			obm16.x=800;
			obm16.y=obr.nextInt(400);
			score++;
		}else
		if(obm17.x==0)
		{
			obm17.x=800;
			obm17.y=obr.nextInt(400);
			score++;
		}else
		if(obm18.x==0)
		{
			obm18.x=800;
			obm18.y=obr.nextInt(400);
			score++;
		}else
		if(obm19.x==0)
		{
			obm19.x=800;
			obm19.y=obr.nextInt(400);
			score++;
		}else
		if(obm20.x==0)
		{
			obm20.x=800;
			obm20.y=obr.nextInt(400);
			score++;
		}
	}
	
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == 38) // Arriba
		{
			obd.sent = 0;
			obd.Avanzar();
		}
		
		if(e.getKeyCode() == 39) // Derecha
		{
			obd.sent = 1;
			obd.Avanzar();
		}
		
		if(e.getKeyCode() == 37) // Izquierda
		{
			obd.sent = 3;
			obd.Avanzar();
		}
		
		if(e.getKeyCode() == 40) // Abajo
		{
			obd.sent = 2;
			obd.Avanzar();
		}
		if(e.getKeyCode() == 112) // Arriba
		{
			new Ayuda();
		}
		
		System.out.println(e.getKeyCode());
	}
	
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}

/** SUBMARINE CRISIS v1.0 JAVA 
	Developed by: Dani Vega
	Graficación ITJ         **/

import javax.swing.*;

import java.awt.*;
import java.net.*;

public class Initial_Loader extends JWindow
{
	private static final long serialVersionUID = 1L;
	JProgressBar barra;
	URL fond;
	JLabel loading, img, yellow;
	
	public Initial_Loader()
	{
		this.setLayout(null);
		this.setSize(401, 498);
		this.setBounds(450,100,401,498);
		
		fond = getClass().getResource("/Resources/SC.png");
		img = new JLabel();
			img.setIcon(new ImageIcon(fond));
			img.setBounds(0,0,500,500);
			img.setOpaque(true);
		barra = new JProgressBar(0,100);
			barra.setBounds(50, 470, 300, 20);
		loading = new JLabel();
			loading.setForeground(Color.white);
			loading.setFont(new Font("Calibri",Font.PLAIN,12));
			loading.setBounds(230, 85, 300, 50);
		yellow = new JLabel("Yellow");
			yellow.setForeground(Color.yellow);
			yellow.setFont(new Font("Impact",Font.PLAIN,28));
			yellow.setBounds(8, 158, 500, 300);
			
		add(yellow);add(loading);add(barra);add(img);		
		this.setVisible(true);
		Barra();
	}

	public void Barra() 
	{
		for (int i = 0; i < 100; i++) 
		{
			if(i==0)
			{
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				loading.setText("Cargando recursos...");
			}
			if(i==50)
			{
				loading.setText("Cargando interfaz gráfica...");
			}
			if(i==75)
			{
				try {Thread.sleep(2000);} catch (InterruptedException e) {}
				loading.setText("Iniciando...");
			}
			barra.setValue(i);
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
		this.setVisible(false);
	}
}

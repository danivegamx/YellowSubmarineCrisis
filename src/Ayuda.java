import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class Ayuda extends JWindow
{
	private static final long serialVersionUID = 1L;
	URL fond;
	JLabel img;
	JButton aceptar;
	public Ayuda()
	{
		this.setLayout(null);
		this.setBounds(358,185,400,500);
		fond = getClass().getResource("/Resources/fondoayuda.jpg");
		img = new JLabel();
			img.setIcon(new ImageIcon(fond));
			img.setBounds(0,0,650,500);
		aceptar = new JButton("Aceptar");
			aceptar.setBounds(150, 330, 100, 20);
			aceptar.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					Salir();
				}
			});
			
			add(aceptar);add(img);
			this.setVisible(true);
	}
	
	public void Salir()
	{
		this.setVisible(false);
	}
}

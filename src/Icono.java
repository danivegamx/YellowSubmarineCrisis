
import java.awt.*;
import java.applet.*;
	
public class Icono extends Applet
{
	private static final long serialVersionUID = 5306963412723571907L;
	int flecha[] = {0x00c0,0x00f0,0xfffc,0xffff,0xfffe,0xfffc,0x00f0,0x00c0};
	
	public void init() 
	{
		this.setBackground(Color.gray);
		this.setSize(800,600);
	}
	
	public void paint(Graphics g) 
	{
		g.setColor(Color.white);
		int x=400,y=300;
		
		for (int i = 0; i < flecha.length; i++) 
			for (int j = 0; j < 16; j++)
			{
				int desp = 0x8000>>j;
				int res = flecha[i]&desp;
				if(res != 0)
					g.drawLine(x+j, y+i, x+j, y+i);
			}
	}
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Mantarraya 
{
	Random obr = new Random();
	
	int mc[] = {0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00060000, 0x000FC000, 0x001FC000, 0x003F0000, 0x00FF0000,
					  0x01FFC000, 0x03FFF000, 0x0FFFF000, 0x1FFFF840, 0x7DFFF8A1, 0x1FFFFD12, 0x1FFFFE0C, 0x1FFFFE0C, 0x1FFFFD12,
			          0x7DFFF8A1, 0x1FFFF840, 0x0FFFF000, 0x03FFF000, 0x01FFC000, 0x00FF0000, 0x003F0000, 0x001FC000, 0x000FC000,
			          0x00060000, 0x00000000, 0x00000000, 0x00000000, 0x00000000};
	
	int x, y, tam = 50, vel, mx, my, sent = obr.nextInt(3),velm=15;
	boolean gameover = false,restart = false;
	Rectangle r1 = new Rectangle();
	
	public Mantarraya(int maxX, int maxY, int v)
	{
		vel = v;
		x=800+obr.nextInt(500);
		y = obr.nextInt(400);
		mx = maxX;
		my = maxY;
	}
	
	public void Avanzar() 
	{
		x-=vel;		
	}
	
	public Rectangle Checar()
	{
		Rectangle rect = new Rectangle(x,y,30,30);
		return rect;
	}
	
	public void Posicionar()
	{
		y = obr.nextInt(400);
	}
	
	public void Pintar(Graphics g) 
	{
		g.setColor(Color.lightGray);
			for (int i = 0; i < mc.length; i++) 
				for (int j = 0; j < 32; j++)
				{
					int desp = 0x8000000>>j;
					int res = mc[i]&desp;
					if(res != 0)
						g.drawLine(x+j, y+i, x+j, y+i);
				}
	}
}

import java.awt.Color;
import java.awt.Graphics;


public class Oyuncu1 {
	private double x, y;
	
	public Oyuncu1(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void move(String face)
	{
		if(face.equals("right"))
			x += 5;
		else if(face.equals("left"))
			x -= 5;
		else if(face.equals("up"))
			y -= 5;
		else
			y +=5;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.cyan);//atılan topun rengi
		g.fillOval((int) x, (int) y, 10, 10);
	}
	
	public int getX()
	{
		return (int)x;
	}
	public int getY()
	{
		return (int)y;
	}

}

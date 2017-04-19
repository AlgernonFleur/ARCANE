package shapes;

import java.awt.*;

public class Circle {
	private int radius;
	private Color color;
	
	public Circle(int radius,Color color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void draw(Graphics2D g,int x,int y){
		g.setColor(this.color);
		g.drawOval(x-this.radius,y-this.radius,
				this.radius*2,this.radius*2);
	}
}

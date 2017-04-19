package test;

import gui.*;
import shapes.*;

import java.awt.*;
import java.util.ArrayList;

public class Draw_1 implements Drawing {
	
	private ArrayList<Counter> counters;
	
	public Draw_1(){
		counters = new ArrayList<>();
		counters.add(new Counter(1));
	}
	
	@Override
	public void draw(Graphics2D g, int width, int height) {
		g.rotate(Math.toRadians(counters.get(0).getVal()),width/2,height/2);
		new Circle(200,Color.cyan).
				draw(g,width/2,height/2);
		new TextCircle(205,"leviathan").
				draw(g,width/2,height/2);
		new Circle(225,Color.cyan).
				draw(g,width/2,height/2);
		g.rotate(Math.toRadians(-counters.get(0).getVal()),width/2,height/2);
		
		g.rotate(Math.toRadians(-counters.get(0).getVal()),width/2,height/2);
		new Circle(170,Color.red).
				draw(g,width/2,height/2);
		new TextCircle(175,"ragnarok").
				draw(g,width/2,height/2);
		new Circle(200,Color.red).
				draw(g,width/2,height/2);
		g.rotate(Math.toRadians(counters.get(0).getVal()),width/2,height/2);
	}
	
	public static void main(String[] args) {
		Draw_1 draw_1 = new Draw_1();
		new Incantation("Draw 1").
				addCircle(draw_1,500,500).
				setTimer(25,draw_1.counters);
	}
}

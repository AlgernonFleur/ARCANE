package gui;

import javax.swing.*;
import java.util.ArrayList;

public class Incantation extends JFrame {
	MagicCircle circle;
	
	public Incantation(String name){
		super(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Incantation addCircle(Drawing drawing, int width, int height){
		this.circle = new MagicCircle(drawing,width,height);
		add(this.circle);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		return this;
	}
	
	public Incantation setTimer(int delay, ArrayList<Counter> counters){
		this.circle.initTimer(delay,counters);
		return this;
	}
}

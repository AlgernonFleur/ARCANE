package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MagicCircle extends JPanel{
	private Drawing circle;
	private int width,height;
	private double theta;
	
	public MagicCircle(Drawing circle, int width, int height) {
		this.circle = circle;
		this.width = width;
		this.height = height;
		setBackground(Color.black);
	}
	
	public void initTimer(int delay, Counter counter){
		new Timer(delay, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counter.incVal();
				repaint();
			}
		}).start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D graphics2D = (Graphics2D) g;
		graphics2D.rotate(Math.toRadians(this.theta),
				this.width/2,this.height/2);
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		circle.draw(graphics2D,this.width,this.height);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width,height);
	}
}

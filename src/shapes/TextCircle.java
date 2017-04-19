package shapes;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class TextCircle {
	private int radius;
	private String input;
	private Font font;
	
	public TextCircle(int radius, String input) {
		this.radius = radius;
		this.input = new TextParser().parse(input);
	}
	
	public void draw(Graphics2D g,int x,int y){
		initFont();
		g.setFont(this.font);
		double theta = Math.toRadians((double)360/(double)input.length());
		for(int i=0;i<input.length();i++) {
			g.drawString(String.valueOf(input.charAt(i)),250,250-radius);
			g.rotate(theta,250,250);
		}
	}
	
	private void initFont(){
		File f = new File("High Drowic.ttf");
		try {
			FileInputStream in = new FileInputStream(f);
			this.font = Font.createFont(Font.TRUETYPE_FONT, in).deriveFont(20f);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

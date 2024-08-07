package DrawingTool;

import java.awt.Color;

public class Stabilizer {
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private Color color = Color.BLACK;
	
	public Stabilizer(int startX, int startY, int endX, int endY) {
		this.startX=startX;
		this.startY=startY;
		this.endX=endX;
		this.endY=endY;
	}
	
	public void draw() {
		Drawing.pen().setColor(color);
		Drawing.pen().drawLine(startX, startY, endX, endY);		
	}
	
	public void draw(Color color) {
		this.color = color;
		draw();
	}
}
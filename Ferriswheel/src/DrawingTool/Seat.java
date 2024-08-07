	package DrawingTool;

import java.awt.Color;

public class Seat {
	private int locationX;
	private int locationY;
	private int rectangleSide;
	private Color color;
	//private int rectangleWidth;
	
	public Seat(int locationX, int locationY, int radius) {
		this.locationX=locationX;
		this.locationY=locationY;
		this.rectangleSide=radius*6/32;
		//this.rectangleWidth=rectangleWidth;
	}
	
	public void draw() {
		Drawing.pen().setColor(color);
		Drawing.pen().fillRect(locationX, locationY, rectangleSide, rectangleSide);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}



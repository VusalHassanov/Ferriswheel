package DrawingTool;

import java.awt.Color;

public class Base {
private int centerX;
private int centerY;
private int baseLength;
private Color color = Color.BLACK;
public Base(int centerX, int centerY, int baseLength) {
	this.centerX=centerX;
	this.centerY=centerY;
	this.baseLength=baseLength;
	}
	
	public void draw() {
		Drawing.pen().setColor(color);
		Drawing.pen().drawLine(centerX, centerY, centerX-baseLength, centerY+baseLength);
		Drawing.pen().drawLine(centerX, centerY, centerX+baseLength, centerY+baseLength);
	}
	
	public void draw(Color color) {
		this.color = color;
		draw();
	}
}


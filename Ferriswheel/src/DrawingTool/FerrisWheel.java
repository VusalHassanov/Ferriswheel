package DrawingTool;

import java.awt.Color;
import java.awt.Point;

public class FerrisWheel implements LocatedRectangle {
	private Base base;
	private Ring ring;
	private Point center;
	private int height;
	private int width;
	private Color color = Color.BLACK; 

	public FerrisWheel(Point center, int radius) {
		
		this.center=center;
		int centerX = center.x;
		int centerY = center.y;
		
		base = new Base(centerX, centerY, radius * 6/4);
		ring = new Ring(centerX, centerY, radius);
		width = (radius * 6/4) * 2;
		int rectangleSide = radius*6/32;
		height = ((centerY + (radius * 6/4) - (centerY-(radius*6/5))-rectangleSide));
		/*System.out.println("here");
		System.out.println(height);
		System.out.println(width);
		System.out.println(center.x);	
		System.out.println(center.y);	*/
	}

	public void draw() {
		base.draw(color);
		ring.draw(color);		
	}
	
	public void draw(Color color) {
		this.color = color;
		draw();
	}

	@Override
	public Point address() {
		// TODO Auto-generated method stub
		return center;
	}



	@Override
	public int width() {
		// TODO Auto-generated method stub
		return width;
	}



	@Override
	public int height() {
		// TODO Auto-generated method stub
		return height;
	}
}

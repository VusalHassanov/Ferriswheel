package DrawingTool;

import java.awt.Color;
import java.util.ArrayList;

public class Ring {
	private int centerX;
	private int centerY;
	private int radius;
	private ArrayList<Stabilizer> stabilizers;
	private ArrayList<Seat> seats;
	private Color color = Color.BLACK;
	
	public Ring(int centerX, int centerY, int radius) {
		stabilizers=new ArrayList<Stabilizer>();
		Stabilizer stabilizer1 = new Stabilizer(centerX, centerY, centerX+radius*6/5, centerY);
		Stabilizer stabilizer2 = new Stabilizer(centerX, centerY, centerX-radius*6/5, centerY);
		Stabilizer stabilizer3 = new Stabilizer(centerX, centerY, centerX, centerY-radius*6/5);
		Stabilizer stabilizer4 = new Stabilizer(centerX, centerY, centerX, centerY+radius*6/5);
		Stabilizer stabilizer5 = new Stabilizer(centerX, centerY, centerX+radius*6/5*5/7, centerY-radius*6/5*5/7);
		Stabilizer stabilizer6 = new Stabilizer(centerX, centerY, centerX-radius*6/5*5/7, centerY-radius*6/5*5/7);
		stabilizers.add(stabilizer1);
		stabilizers.add(stabilizer2);
		stabilizers.add(stabilizer3);
		stabilizers.add(stabilizer4);
		stabilizers.add(stabilizer5);
		stabilizers.add(stabilizer6);
		
		int rectangleSide=radius*6/32;
		seats = new ArrayList<Seat>();
		Seat seat1 = new BlueSeat(centerX+radius*6/5-rectangleSide/2, centerY-rectangleSide/2, radius);
		Seat seat2 = new BlueSeat(centerX-radius*6/5-rectangleSide/2, centerY-rectangleSide/2, radius);
		Seat seat3 = new BlueSeat(centerX-rectangleSide/2, centerY-radius*6/5-rectangleSide/2, radius);
		Seat seat4 = new BlueSeat(centerX-rectangleSide/2, centerY+radius*6/5-rectangleSide/2, radius);
		Seat seat5 = new RedSeat(centerX+radius*6/5*5/7-rectangleSide/2, centerY-radius*6/5*5/7-rectangleSide/2, radius);
		Seat seat6 = new RedSeat(centerX-radius*6/5*5/7-rectangleSide/2, centerY-radius*6/5*5/7-rectangleSide/2, radius);
		Seat seat7 = new RedSeat(centerX+radius*6/5*5/7-rectangleSide/2, centerY+radius*6/5*5/7-rectangleSide/2, radius);
		Seat seat8 = new RedSeat(centerX-radius*6/5*5/7-rectangleSide/2, centerY+radius*6/5*5/7-rectangleSide/2, radius);
		seats.add(seat1);
		seats.add(seat2);
		seats.add(seat3);
		seats.add(seat4);
		seats.add(seat5);
		seats.add(seat6);
		seats.add(seat7);
		seats.add(seat8);
		
		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;
	}
	
	public void draw(Color color) {
		this.color = color;
		draw();
	}
	
	public void draw() {
		Drawing.pen().setColor(color);
		Drawing.pen().drawOval(centerX-radius, centerY-radius, 2*radius, 2*radius);
		Drawing.pen().drawOval(centerX-radius*2/5, centerY-radius*2/5, radius*4/5, radius*4/5);
		
		for (Stabilizer f : stabilizers) {
			f.draw(color);
		}
		
		for (Seat f : seats) {
			f.draw();
		}
	}
}

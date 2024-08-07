package DrawingTool;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Scene {
	private ArrayList<FerrisWheel> ferriswheels;
	private Color color = Color.RED;
	public Scene(Color color) {		
		ferriswheels = new ArrayList<FerrisWheel>();
		FerrisWheel ferriswheel1 = new FerrisWheel(new Point(500,100),80);
		ferriswheels.add(ferriswheel1);
		this.color = color;
		
		for(int i=0; i<1500; i+=90) {
			for(int j=0; j<1200; j+=150) {
				addFerrisWheels(new Point(i+40, j), 50);
			}
		}
	}

	
	private void addFerrisWheels(Point center, int radius) {
		FerrisWheel newFerrisWheel = new FerrisWheel(center, radius);
		if(vacantProperty(newFerrisWheel)) {
			ferriswheels.add(newFerrisWheel);
			
		}	
	}

	private boolean vacantProperty(FerrisWheel newFerrisWheel) {
		boolean anyIntersection = false;
		for(FerrisWheel h : ferriswheels) {
			anyIntersection = anyIntersection || h.intersects(newFerrisWheel);
		}
		return ! anyIntersection;
	}
	

	public void draw() {		
		for (FerrisWheel f : ferriswheels) {
			f.draw(color);
		}
	}
	
	public void updateColor(Color c) {
		color = c;
	}

	public static int between(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1) + min);
	}
}

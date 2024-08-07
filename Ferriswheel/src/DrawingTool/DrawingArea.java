/**
 * Provides a panel which can be used for drawing.
 * 
 * @author
 * @version 1.0
 */

package DrawingTool;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Color color = Color.RED;
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);		
		Drawing.set(pen);
		Scene scene = new Scene(color);
		scene.draw();		
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
/**
 * Provides a test application window with a panel.
 * 
 * @author
 * 
 * @version 1.0
 */

package DrawingTool;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDrawingTool {
	private JFrame applicationFrame;
	
	public TestDrawingTool(String title) {
		applicationFrame = new JFrame(title);
		Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
		applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
		applicationFrame.setVisible(true);
	}
	
	public void addACanvas(JPanel p) {
		applicationFrame.add(p);
	}
	
	public static void main(String[] args) {
		TestDrawingTool anApplication = new TestDrawingTool("A drawing tool");
		anApplication.addACanvas(new DrawingArea());
	}
}
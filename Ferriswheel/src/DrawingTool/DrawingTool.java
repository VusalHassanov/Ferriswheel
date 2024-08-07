

package DrawingTool;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();

	public DrawingTool(String title) {
		super(title);
		
		setLayout(new BorderLayout());

		constructButtonMenu();
		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		setVisible(true);
	}
	
	private void constructButtonMenu() {
		buttons.addButtonsToAPanel(this);
		buttons.addActionListener(this);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.getSubmitButton()) {
			String color = buttons.getDropdownList().getSelectedItem().toString();
			buttons.gettextField().setText(color);
			buttons.gettextField().setForeground(getColorFromString(color));
			drawing.setColor(getColorFromString(color));
			tidyUpDrawingArea();
		}
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();		
	}
	
	public static void main(String[] args) {
		new DrawingTool("Draw a house");
	}
	
	private Color getColorFromString(String colorName) {
		if (colorName.toUpperCase().equals("RED")) {
			return Color.RED;
		}
		if (colorName.toUpperCase().equals("GREEN")) {
			return Color.GREEN;
		}
		if (colorName.toUpperCase().equals("YELLOW")) {
			return Color.YELLOW;
		}
		if (colorName.toUpperCase().equals("BLACK")) {
			return Color.BLACK;
		}
		if (colorName.toUpperCase().equals("BLUE")) {
			return Color.BLUE;
		}
		return Color.RED;
	}
}

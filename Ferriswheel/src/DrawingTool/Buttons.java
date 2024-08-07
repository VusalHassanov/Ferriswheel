package DrawingTool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Buttons {
	private JLabel text = new JLabel("Selected Color:");	
	private JLabel textField = new JLabel("RED");
	private JButton submitButton = new JButton("Submit");
	private JComboBox<String> cb;

	public void addActionListener(ActionListener listener) {
		submitButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));
		
		String[] colors = { "RED", "GREEN", "YELLOW", "BLACK",
	            "BLUE"};

		cb = new JComboBox<String>(colors);

		textField.setForeground(Color.RED);
		menu.add(cb);
		menu.add(submitButton);
		menu.add(text);
		menu.add(textField);

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}
	
	public JLabel gettextField() {
		return textField;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}
	
	public JComboBox getDropdownList() {
		return cb;
	}
}

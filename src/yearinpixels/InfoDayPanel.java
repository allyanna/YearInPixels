package yearinpixels;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InfoDayPanel extends JPanel {

	public InfoDayPanel() {

		this.setLayout(new GridLayout(3, 0));

		// top panel
		this.add(new JLabel("Mood color:", SwingConstants.CENTER));

		// center Panel
		this.add(new JLabel("Overall mood labels:", SwingConstants.CENTER));

		// bottom panel
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2, 0, 0, 0));

		bottomPanel.add(new JLabel("Additional Info:", SwingConstants.CENTER));
		bottomPanel.add(new JTextField(16));
		this.add(bottomPanel);
	}

}

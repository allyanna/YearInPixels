package yearinpixels;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class calendarPanel extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public calendarPanel() {
		GridLayout layout = new GridLayout(31, 12);

		this.setLayout(layout);

		for (int d = 1; d <= 31; d++)
			for (int m = 1; m <= 12; m++) {
				JButton button = new JButton("" + d);
				button.setFont(new Font("Cambria", Font.PLAIN, 15));
				button.setMargin(new Insets(1, 1, 1, 1));
				button.setPreferredSize(new Dimension(26, 26));
				this.add(button);
			}
	}
}

package yearinpixels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class calendarPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public calendarPanel() {

		this.setLayout(new BorderLayout());

		// north
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(2, 0));
		topPanel.add(new JLabel("Month", SwingConstants.CENTER));

		JPanel monthPanel = new JPanel();
		
		//TODO: fix gap
		GridLayout gridLayout = new GridLayout(0, 12);
		monthPanel.setLayout(gridLayout);
		for (int i = 1; i <= 12; i++)
			monthPanel.add(new JLabel(getMonth(i), SwingConstants.RIGHT));
		topPanel.add(monthPanel);

		this.add(topPanel, BorderLayout.NORTH);

		// west
		this.add(new VerticalLabel("Day", SwingConstants.CENTER), BorderLayout.WEST);

		JPanel squaresPanel = new JPanel();
		GridLayout layout = new GridLayout(31, 12);

		squaresPanel.setLayout(layout);
		for (int d = 1; d <= 31; d++) {

			squaresPanel.add(new JLabel("" + d)); // for days
			for (int m = 1; m <= 12; m++) {
				JButton button = new JButton();
				button.setFont(new Font("Cambria", Font.PLAIN, 15));
				button.setMargin(new Insets(1, 1, 1, 1));
				button.setPreferredSize(new Dimension(26, 26));
				squaresPanel.add(button);
			}
		}
		this.add(squaresPanel, BorderLayout.CENTER);
	}

	public String getMonth(int num) {
		switch (num) {
		case 1:
			return "M";
		case 2:
			return "F";
		case 3:
			return "M";
		case 4:
			return "A";
		case 5:
			return "M";
		case 6:
			return "J";
		case 7:
			return "J";
		case 8:
			return "A";
		case 9:
			return "S";
		case 10:
			return "O";
		case 11:
			return "N";
		default:
			return "D";
		}

	}

	private class VerticalLabel extends JLabel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public VerticalLabel(String s, int c) {
			super(s, c);
		}

		@Override
		public void paintComponent(Graphics g) {
			Graphics2D gx = (Graphics2D) g;
			gx.rotate(Math.toRadians(270), getWidth() / 2, getHeight() / 2);
			super.paintComponent(g);
		}

	}
}

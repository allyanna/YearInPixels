package yearinpixels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class YearPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YearPanel() {

		this.setLayout(new BorderLayout());

	
		
		// center
		this.add(new calendarPanel(), BorderLayout.CENTER);
		
		// east
		this.add(new InfoDayPanel(), BorderLayout.EAST);
	}

	private class VerticalLabel extends JLabel {
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

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

public class YearPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		YearPanel panel = new YearPanel();
	}

	public YearPanel() {

		this.setLayout(new BorderLayout());

		this.add(new VerticalLabel("Day"), BorderLayout.WEST);
		this.add(new JLabel("Month"), BorderLayout.NORTH);
		this.add(new calendarPanel(), BorderLayout.CENTER);
	}

	private class VerticalLabel extends JLabel {
		public VerticalLabel(String s) {
			super(s);
		}

		@Override
		public void paintComponent(Graphics g) {
			Graphics2D gx = (Graphics2D) g;
			gx.rotate(Math.toRadians(270), getWidth() / 2, getHeight() / 2);
			super.paintComponent(g);
		}

	}

}

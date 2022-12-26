package yearinpixels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
		
		this.add(new JLabel("Day"), BorderLayout.WEST);
		this.add(new JLabel("Month"), BorderLayout.NORTH);
		this.add(new calendarPanel(), BorderLayout.CENTER);
	}

}

package yearinpixels;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Year in Pixels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1200, 1200));
		MainPanel gui = new MainPanel();
		frame.setContentPane(gui);
		frame.pack();
		frame.setVisible(true);
	}
	
	public MainPanel() {
		
		this.setLayout(new BorderLayout());
		this.add(new YearPanel(), BorderLayout.WEST);
		
		JButton searchButton = new JButton("search");
	}

}

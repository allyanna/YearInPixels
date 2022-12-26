package yearinpixels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Year in Pixels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 1200));
		MainPanel gui = new MainPanel();
		frame.setContentPane(gui);
		frame.pack();
		frame.setVisible(true);
	}
	
	public MainPanel() {
		
		this.setLayout(new BorderLayout());
		this.add(new YearPanel(), BorderLayout.WEST);
		
		//buttons in main
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,3));
		
		JButton uploadCSVButton = new JButton("Upload from CSV");
		buttonPanel.add(uploadCSVButton);
		
		JButton analyzeButton = new JButton("Analyze");
		buttonPanel.add(analyzeButton);
		
		JButton saveButton = new JButton("Save");
		buttonPanel.add(saveButton);
		
		this.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	
	

}

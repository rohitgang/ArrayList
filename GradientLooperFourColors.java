



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draws gradients across the width of the panel
 * 
 * @author Rohit Gangurde
 */
@SuppressWarnings("serial")
public class GradientLooperFourColors extends JPanel {
	/*
	 * This method draws on the Graphics context. This is where your work will be.
	 *
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics canvas) {
		// ready to paint
		super.paintComponent(canvas);

		// account for changes to window size
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		final int GRADIENT_DIVISIONS = 256;
		final int NUM_GRADIENT_BARS = 1;

		// TODO: Your code goes here
		double rec = ((double)width) / 256.00;
		int rec_ht = (int) Math.ceil(rec);
		System.out.println(rec);
	double wid = ((double)height)/4;
	int wid1 = (int)Math.ceil(wid);
		 for(int i = 0; i<256; i++) {
		
		 
		 Color jack = new Color(i,i,i); 
		 canvas.setColor(jack);
		 canvas.fillRect((rec_ht*i), 0, rec_ht, wid1);
	
		 }
 for(int i = 0; i<256; i++) {
		
		 
		 Color jack = new Color(i,0,0); 
		 canvas.setColor(jack);
		 canvas.fillRect(rec_ht*i,wid1,rec_ht , wid1);
	
		 }
	for(int i = 0; i<256; i++) {
		
		 
		 Color jack = new Color(0,i,0); 
		 canvas.setColor(jack);
		 canvas.fillRect(rec_ht*i,2*wid1,rec_ht , wid1);
	
		 }
	for(int i = 0; i<256; i++) {
		
		 
		 Color jack = new Color(0,0,i); 
		 canvas.setColor(jack);
		 canvas.fillRect(rec_ht*i,wid1*3,rec_ht , wid1);
	
		 }}
		 
		 
		 
	

	/**
	 * DO NOT MODIFY Constructor for the display panel initializes necessary
	 * variables. Only called once, when the program first begins.
	 */
	public GradientLooperFourColors() {
		setBackground(Color.black);
		int initWidth = 768;
		int initHeight = 512;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);
	}

	/**
	 * DO NOT MODIFY Starting point for the program
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("GradientLooperGrayscale");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GradientLooperFourColors());
		frame.pack();
		frame.setVisible(true);
	}
}

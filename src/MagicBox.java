
/*
 *    Copyright (c) The League of Amazing Programmers 2019-2018
 *    Level 5
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. When the user clicks on a
	 * secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the
	 * default package) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the
	 * color of the current pixel.
	 */
	MediaPalace mediaPalace = new MediaPalace();
	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());

	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		JFrame frame1 = new JFrame();
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//X-197 Y-535
		//X-188 Y-861
		//X-346 Y-653
		System.out.println(e.getX());
		System.out.println(e.getY());
if(e.getX()>190 && e.getX()<215 && e.getY()>525 && e.getY()<545) {
	mediaPalace.speak("Cow");
}
	else if(e.getX()>180 && e.getX()<200 && e.getY()>850 && getY()<870) {
		mediaPalace.playMusicOnComputer("src/moo.wav");
	}
	if(e.getX()>340 && e.getX()<355 && e.getY()>650 && e.getY()<665) {
		try {
			mediaPalace.loadImageFromTheInternet("https://assets.change.org/photos/0/gi/vi/UAGiVICSCIFfeRL-800x450-noPad.jpg?1542497807");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

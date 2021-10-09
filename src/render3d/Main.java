package render3d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	static BufferedImage screen = new BufferedImage(700, 700, BufferedImage.TYPE_INT_RGB);
	public static void main(String[] args) {
		JFrame frame = new JFrame("Adrian Gjonca's 3D Renderer");
		frame.setSize(750, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(true);
		while(true) {
			Graphics g = panel.getGraphics();
			Render.frame(screen);
			g.drawImage(screen, 0, 0, null);
		}
	}
}

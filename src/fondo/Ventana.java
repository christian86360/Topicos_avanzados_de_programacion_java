package fondo;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	public Image imagenFondo;
	public URL fondo;

	public Ventana() {
		this.setBounds(0, 0, 400, 400);
		this.setTitle("Ventana");

		this.setVisible(true);
		this.setLocationRelativeTo(null);

		fondo = this.getClass().getResource("/fondo/azul2.png");
		imagenFondo = new ImageIcon(fondo).getImage();
		Container contentpane = getContentPane();

		contentpane.add(panel);
	}

	public JPanel panel = new JPanel() {
		public void paint(Graphics g) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	};

	public static void main(String[] args) {
		Ventana ventanita = new Ventana();

	}

}

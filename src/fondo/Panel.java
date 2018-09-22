package fondo;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public Image imagenFondo;
	public  URL fondo;

	public Panel() {
		preInit();
		initComponents();
	}

	private void initComponents() {
		// TODO Auto-generated method stub

	}

	private void preInit() {
		fondo=this.getClass().getResource("azul2.png");
		imagenFondo= new ImageIcon(fondo).getImage();
       
	}

	public void paint(Graphics g) {
		g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
	}
}

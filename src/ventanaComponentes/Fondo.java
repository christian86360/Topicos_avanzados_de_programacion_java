package ventanaComponentes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel{
	private Image fondo;
	
	public Fondo(){
		preInit();
		initComponents();
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}

	private void preInit() {
	fondo=new ImageIcon("rojo.png").getImage();
	
		
	}
	public void paint(Graphics g){
		g.drawImage(fondo, 0, 0,getWidth(), getHeight(),this);
	}

}

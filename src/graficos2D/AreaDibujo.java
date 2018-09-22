package graficos2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;

import javax.swing.JPanel;
public class AreaDibujo extends JPanel{
	
	public AreaDibujo(){
		setBounds(0,0,800,400);
		setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawOval(20, 20, 50, 50);
		g.setColor(Color.GRAY);
		g.fillRect(80, 20, 40, 40);
		g.setColor(Color.RED);
		g.fillRoundRect(150, 20, 40, 40, 10, 23);
	}
	

}

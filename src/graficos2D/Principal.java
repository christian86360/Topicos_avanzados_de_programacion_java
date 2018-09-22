package graficos2D;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;;
public class Principal extends JFrame {
	
	AreaDibujo ad;
	JPanel pnHerramientas;
	JButton btnCirculo,btnCirculoR;
	public Principal(){
		setTitle("Graficos En Java");
		setBounds(100,50,700,400);
		//setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCirculo=new JButton("Circulo Vacio");
		btnCirculo.setBounds(10,10,120,40);
		btnCirculoR=new JButton("Circulo Relleno");
		btnCirculoR.setBounds(10,60,120,40);
		pnHerramientas=new JPanel(null);
		pnHerramientas.setBounds(0, 0, 200, 400);
		pnHerramientas.setBackground(Color.DARK_GRAY);
		pnHerramientas.add(btnCirculo);
		pnHerramientas.add( btnCirculoR);
		add(pnHerramientas);
		ad=new AreaDibujo();
		//agregando
		add(ad);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Principal ventana =new Principal();

	}

	

}

package propios_metodos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;;
public class Principal extends JFrame implements ActionListener{
	
	AreaDibujo ad;
	JPanel pnHerramientas;
	JButton btnCirculo,btnCirculoR,btnBorrar;
	public Principal(){
		setTitle("Graficos En Java");
		setBounds(100,50,400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCirculo=new JButton("Circulo Vacio");
		btnCirculo.setBounds(10,10,120,40);
		btnCirculoR=new JButton("Circulo Relleno");
		btnCirculoR.setBounds(10,60,120,40);
		btnBorrar=new JButton("Borrar");
		btnBorrar.setBounds(10,110,120,40);
		pnHerramientas=new JPanel(null);
		pnHerramientas.setBounds(0, 0, 200, 400);
		pnHerramientas.setBackground(Color.DARK_GRAY);
		pnHerramientas.add(btnCirculo);
		pnHerramientas.add( btnCirculoR);
		pnHerramientas.add(btnBorrar);
		add(pnHerramientas);
		ad=new AreaDibujo();
		//agregando
		add(ad);
		btnCirculo.addActionListener(this);
		btnCirculoR.addActionListener(this);
		btnBorrar.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Principal ventana =new Principal();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCirculo){
			AreaDibujo.dibujoCirciloVacio(ad.getGraphics(), 50,50, 80, 80);
		}
		if(e.getSource()==btnCirculoR){
			AreaDibujo.dibujoCirciloRelleno(ad.getGraphics(), 50,150, 80, 80);
		}
		if(e.getSource()==btnBorrar){
			repaint();
		}
	}

}

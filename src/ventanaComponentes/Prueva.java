package ventanaComponentes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prueva extends JFrame {

	public Prueva() {

		super("Progra Christian");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton boton = new JButton("salir");
		JLabel nombre = new JLabel("Hola mundo");
		JPanel contenido = new JPanel();
		boton.setBounds(100, 200, 100, 200);
		contenido.add(boton);
		contenido.add(nombre);
		setContentPane(contenido);

		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prueva ventana = new Prueva();

	}

}

package ventanaComponentes;

import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//para los eventos
public class Ventana2 extends JFrame implements ActionListener {
	// Declaramos las variables
	JButton btAcectar, btCancelar;

	public Ventana2() {
		//
		super("Ventana con gestor nulo");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Creamos nuestros componentes
		btAcectar = new JButton("Aceptar");
		btCancelar = new JButton("Cancelar");
		FlowLayout gestor = new FlowLayout();

		JPanel pnlcont = new JPanel();
		// ubicar nuestros botones en el lugar deseado
		// btAcectar.setBounds(pos x,pos y, ancho,alto);
		btAcectar.setBounds(100, 50, 120, 30);
		btCancelar.setBounds(100, 90, 120, 30);
		// agregamos al contenedor
		pnlcont.add(btAcectar);
		pnlcont.add(btCancelar);
		setContentPane(pnlcont);
		// agregamos el evento para que escuchador al boton
		btAcectar.addActionListener(this);
		btCancelar.addActionListener(this);
		setVisible(true);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana2 ventana = new Ventana2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAcectar) {
			JOptionPane.showMessageDialog(null, "Pulsaste el boton");
		}
		if (e.getSource() == btCancelar) {
			JOptionPane.showMessageDialog(null, "Pulsaste el cancelar");
		}

	}

}

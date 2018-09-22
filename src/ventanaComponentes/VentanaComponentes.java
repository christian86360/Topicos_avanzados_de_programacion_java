package ventanaComponentes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaComponentes extends JFrame {
	// constructor
	public VentanaComponentes() {
		// creamos nuestra ventana....Paso 1
		super("Ventana con Componentes");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Creamos los componectes....Paso 2
		// creamos una etiqueta
		JLabel lblNombre = new JLabel("Nombre:");
		// creamos un campo de texto
		JTextField txtNombre = new JTextField(20);
		// creamos un boton
		JButton btnSinEvento = new JButton("Boton Sin Evento");
		// cramos el contenedor que contendra los componentes...Paso3
		JPanel pnlContenido = new JPanel();
		// agregamos los componentes al contenedor....Paso 4
		pnlContenido.add(lblNombre);
		pnlContenido.add(txtNombre);
		pnlContenido.add(btnSinEvento);
		// asociamos el contenedor ala ventana...Paso 5
		setContentPane(pnlContenido);
		// acemos vicible la ventana....Paso 6
		setVisible(true);

	}

	public static void main(String[] args) {
		VentanaComponentes ventana = new VentanaComponentes();

	}
}

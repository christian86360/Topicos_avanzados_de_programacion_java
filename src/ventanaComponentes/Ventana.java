package ventanaComponentes;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Ventana extends JFrame implements ActionListener {
	// declaramos las variables
	JButton btmostrar, btborrar;
	JLabel lbnombre, lbedad, lbdatos;
	JTextField txtNombre, txtEdad, txtDatos;
	ImageIcon miImajen, miImajen2;
	Fondo p;

	// consttructor
	public Ventana() {
		super("Utilizando setText y getText");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Container contentpane = getContentPane();
		p = new Fondo();
		
		// Creamos los componentes
		lbnombre = new JLabel("Nombre");
		lbedad = new JLabel("Edad");
		lbdatos = new JLabel("Datos");
		txtNombre = new JTextField(30);
		txtEdad = new JTextField(10);
		txtDatos = new JTextField(50);
		// Creamos nuestra imajen
		miImajen2 = new ImageIcon("hatake_kakashi.png");
		miImajen = new ImageIcon("uzumaki_naruto.png");
		// creamos el boton y le agregamos la imajen
		btmostrar = new JButton("Mostrar", miImajen);
		btborrar = new JButton("Borrar", miImajen2);
		// FlowLayout gestor =new FlowLayout();
		JPanel pnlCont = new JPanel(null);
		// objeto de la clase fondo

		//
		p = new Fondo();
		contentpane.add(p);
		// ubicamos nuestros botones en el lugar deseado
		// setBounds(pos x,pos y,ancho,largo)
		lbnombre.setBounds(5, 10, 50, 20);
		lbedad.setBounds(5, 50, 50, 20);
		txtNombre.setBounds(75, 10, 150, 20);
		txtEdad.setBounds(75, 50, 50, 20);
		txtDatos.setBounds(75, 90, 230, 20);
		btmostrar.setBounds(320, 10, 140, 40);
		btborrar.setBounds(320, 90, 140, 40);
		contentpane.add(p);
		pnlCont.add(lbnombre);
		pnlCont.add(lbedad);
		pnlCont.add(txtNombre);
		pnlCont.add(txtEdad);
		pnlCont.add(txtDatos);
		pnlCont.add(btmostrar);
		pnlCont.add(btborrar);
		
		setContentPane(pnlCont);
		setVisible(true);

		// agragamos el escuchador al boton
		btmostrar.addActionListener(this);
		btborrar.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v = new Ventana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre, edad = "", datos = "";
		// para el boton mostrar
		if (e.getSource() == btmostrar) {
			// octenemos el texto de estos dos componentes
			nombre = txtNombre.getText();
			edad = txtEdad.getText();
			// asignamos el texto al componente
			txtDatos.setText("Tu nombre es: " + nombre + " y tienes " + edad + " años");

		}
		if (e.getSource() == btborrar) {
			txtNombre.setText("");
			txtEdad.setText("");
			txtDatos.setText("");
		}

	}

}

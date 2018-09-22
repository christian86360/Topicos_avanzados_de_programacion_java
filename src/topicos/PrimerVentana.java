package topicos;

import javax.swing.*;
import java.awt.*;

public class PrimerVentana extends JFrame {
	// constructor
	/*
	 * public PrimerVentana(){ super("MI PRIMER VENTANA EN JAVA");
	 * setSize(400,600);//tamaño de la ventana
	 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para serar la ventana
	 * vaciar la memoria setVisible(true);//para hacer vicible la ventana
	 */

	public static void main(String[] args) {
		PrimerVentana v = new PrimerVentana();
		v.setTitle("MI PRIMER VENTANA EN JAVA");
		v.setSize(400, 400);// tamaño de la ventana
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// para serar la
															// ventana vaciar la
															// memoria
		v.setVisible(true);// para hacer vicible la ventana

	}
}

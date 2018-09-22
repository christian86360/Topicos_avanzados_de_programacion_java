package ConversorDivisas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorDivisas extends JFrame {

	private JPanel pnlContenido;
	private JTextField textDolares;
	private JTextField textEuros;
	private JTextField textPesos;
	private JButton btnDolaresAPesos;
	private JButton btnEurosAPesos;

	double pesos = 0.0, dolares = 0.0, euros = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisas frame = new ConversorDivisas();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorDivisas() {
		setTitle("Conversor de Divisas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 252);
		pnlContenido = new JPanel();
		pnlContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlContenido);
		pnlContenido.setLayout(null);

		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(28, 28, 46, 14);
		pnlContenido.add(lblDolares);

		textDolares = new JTextField();
		textDolares.setBounds(146, 25, 86, 20);
		pnlContenido.add(textDolares);
		textDolares.setColumns(10);

		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(28, 94, 46, 14);
		pnlContenido.add(lblEuros);

		textEuros = new JTextField();
		textEuros.setBounds(146, 91, 86, 20);
		pnlContenido.add(textEuros);
		textEuros.setColumns(10);

		JLabel lblPesos = new JLabel("Pesos");
		lblPesos.setBounds(28, 158, 46, 14);
		pnlContenido.add(lblPesos);

		textPesos = new JTextField();
		textPesos.setEnabled(false);
		textPesos.setBounds(146, 155, 269, 20);
		pnlContenido.add(textPesos);
		textPesos.setColumns(10);
	

		btnDolaresAPesos = new JButton("Dolares a Pesos");
		btnDolaresAPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					dolares = Double.parseDouble(textDolares.getText());
					pesos = dolares * 17.51;
					textPesos.setText("" + pesos);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error de datos");

				}
			}
		});
		btnDolaresAPesos.setBounds(272, 24, 143, 23);
		pnlContenido.add(btnDolaresAPesos);

		btnEurosAPesos = new JButton("Euros a Pesos");
		btnEurosAPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					euros = Double.parseDouble(textEuros.getText());
					pesos = euros * 18.83;
					textPesos.setText("" + pesos);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error de datos");

				}
				
			}
		});
		btnEurosAPesos.setBounds(272, 90, 143, 23);
		pnlContenido.add(btnEurosAPesos);
	}
}

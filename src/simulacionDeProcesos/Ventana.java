package simulacionDeProcesos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	JProgressBar BarExel;
	JProgressBar BarPaint;
	JProgressBar BarWord;
	Exel hExel;
	Word hWord;
	Paint hPaint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Simulacion De Procesos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProcesoWord = new JLabel("Proceso Word:");
		lblProcesoWord.setBounds(32, 46, 108, 14);
		contentPane.add(lblProcesoWord);
		
		JLabel lblProcesoPaint = new JLabel("Proceso Paint:");
		lblProcesoPaint.setBounds(31, 93, 88, 14);
		contentPane.add(lblProcesoPaint);
		
		JLabel lblProcesoExel = new JLabel("Proceso Exel:");
		lblProcesoExel.setBounds(32, 151, 102, 20);
		contentPane.add(lblProcesoExel);
		
		 BarWord = new JProgressBar();
		BarWord.setBounds(144, 44, 205, 26);
		contentPane.add(BarWord);
		
		 BarPaint = new JProgressBar();
		BarPaint.setBounds(144, 93, 205, 26);
		contentPane.add(BarPaint);
		
		 BarExel = new JProgressBar();
		BarExel.setBounds(144, 145, 205, 26);
		contentPane.add(BarExel);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				BarExel.setForeground(Color.GREEN);
				BarWord.setForeground(Color.GREEN);
				BarPaint.setForeground(Color.GREEN);
				hExel=new Exel(BarExel);
				Thread hE=new Thread(hExel,"Exel");
				hWord=new Word(BarWord);
				Thread hW=new Thread(hWord,"Word");
				hPaint=new Paint(BarPaint);
				Thread hP=new Thread(hPaint,"Paint");
				
				
				hE.start();
				hW.start();
				hP.start();
			   
				
			}
		});
		btnIniciar.setBounds(19, 203, 100, 34);
		contentPane.add(btnIniciar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hExel.fin=true;
				hWord.fin=true;
				hPaint.fin=true;
				
			}
		});
		btnFinalizar.setBounds(319, 203, 89, 34);
		contentPane.add(btnFinalizar);
	}
}

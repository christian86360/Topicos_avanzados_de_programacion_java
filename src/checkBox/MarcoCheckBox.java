package checkBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoCheckBox extends JFrame {

	public static void main(String[] args) {

		Check mimarco = new Check();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Check extends JFrame {
	public Check() {
		setBounds(550, 300, 550, 350);
		
		setVisible(true);
		LaminaCheck milamina = new LaminaCheck();
		add(milamina);
		setVisible(true);
	
		

	}

	class LaminaCheck extends JFrame {
		public LaminaCheck() {
			setLayout(new BorderLayout());
			Font miletra = new Font("Serif", Font.PLAIN, 24);
			texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
			texto.setFont(miletra);
			JPanel laminaTexto = new JPanel();
			laminaTexto.add(texto);
			add(laminaTexto, BorderLayout.CENTER);
			check1 = new JCheckBox("Negrita");
			check2 = new JCheckBox("Cursiva");
			check1.addActionListener(new ManejaChecks());
			check2.addActionListener(new ManejaChecks());

			JPanel laminacheck = new JPanel();
			laminacheck.add(check1);
			laminacheck.add(check2);
			add(laminacheck, BorderLayout.SOUTH);

		}

		// clase interna
		private class ManejaChecks implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				int tipo=0;
				if(check1.isSelected()) tipo+=Font.BOLD;
				
				if(check2.isSelected()) tipo+=Font.ITALIC;
				
				texto.setFont(new Font("Serif",tipo,24));
					
				

			}

		}

		private JLabel texto;
		private JCheckBox check1, check2;
	}
}

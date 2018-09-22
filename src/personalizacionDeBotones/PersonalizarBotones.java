package personalizacionDeBotones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PersonalizarBotones extends JFrame implements ActionListener {
	
	JButton btnPersoanalizado;
	JPanel pnl;
	ImageIcon imagNormal,imgPasar,imgPulsado;
	
	public PersonalizarBotones(){
		super("Personalizacion Botones");
		setBounds(500,200,400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnPersoanalizado=new JButton();
		btnPersoanalizado.setBounds(120,60,146,46);
		
		imagNormal=new ImageIcon(PersonalizarBotones.class.getResource("/imajen/aceptarNormal.png"));
		imgPasar=new ImageIcon(PersonalizarBotones.class.getResource("/imajen/aceptarPasar.png"));
		imgPulsado=new ImageIcon(PersonalizarBotones.class.getResource("/imajen/aceptarPulsar.png"));
		//Personalizando el boton
		
		btnPersoanalizado.setIcon(imagNormal);
	
	     btnPersoanalizado.setBorder(null);
	     btnPersoanalizado.setBorderPainted(false);
	     btnPersoanalizado.setContentAreaFilled(false);
	     btnPersoanalizado.setIcon(imagNormal);
	     btnPersoanalizado.setPressedIcon(imgPasar);
	     btnPersoanalizado.setRolloverIcon(imgPulsado);
		
		pnl=new JPanel(null);
		
		pnl.add(btnPersoanalizado);
		add(pnl);
		btnPersoanalizado.addActionListener(this);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new PersonalizarBotones();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnPersoanalizado){
			JOptionPane.showMessageDialog(null, "Boton personalizado");
		}
		
	}
	
	

}

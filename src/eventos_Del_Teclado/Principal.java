package eventos_Del_Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JFrame implements KeyListener {
	JLabel lbPulsa,lbTecla;
	JTextField txtPulsa,txtTecla;
	public Principal(){
		super("Eventos Del Teclado");
		setBounds(300,300,400,200);
        JPanel pnl=new JPanel(null);
        lbPulsa=new JLabel("Pulsa una tecla:");
        lbPulsa.setBounds(10, 50, 150, 20);
        txtPulsa=new JTextField(50);
        txtPulsa.setBounds(180, 50, 150, 20);
         lbTecla=new JLabel("Codigo de la tecla:");
         lbTecla.setBounds(10,80,150,20);
         txtTecla=new JTextField(50);
         txtTecla.setBounds(180,80,150,20);
         txtPulsa.setEnabled(false);
         txtTecla.setEnabled(false);
         pnl.add(lbPulsa);
         pnl.add(txtPulsa);
         pnl.add(lbTecla);
         pnl.add(txtTecla);
         add(pnl);
         addKeyListener(this);
         setVisible(true);
	}

	public static void main(String[] args) {
		Principal ventana=new Principal();
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		//para saber que tecla pulso
		txtPulsa.setText(kp.getKeyText(kp.getKeyCode()));
		txtTecla.setText(""+kp.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent kr) {
		
		txtPulsa.setText("solto: "+kr.getKeyText(kr.getKeyCode()));
		
	}
	/**Este metodo funcionará solo cuando se presionan caracteres, 
	 *si se presionan teclas como F1, F2, inicio etc no ejecutará 
	 *ningun evento*/
	 
	@Override
	public void keyTyped(KeyEvent kt) {
		
		
	}

}

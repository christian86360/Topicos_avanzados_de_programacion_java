package menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Mimenu extends JFrame{
	//declarando
JMenuItem cmdAbrir,cmdCerrar,cmdSalir,cmdCopiar,cmdPegar;
JMenu emuAchivo,emuEdicion;
JMenuBar braMenu;
	 
	public Mimenu() {
		
		super("Mi primer Menu");
		setBounds(200,200,800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//paso 1 crear los JMenuItem
	   cmdAbrir=new JMenuItem("Abrie");
	   cmdCerrar=new JMenuItem("Cerrar");
	   cmdSalir=new JMenuItem("Salir");
	   cmdCopiar=new JMenuItem("Copiar");
	   cmdPegar=new JMenuItem("Pegar");
	   //paso 2 crear los JMenu
	   emuAchivo=new JMenu("Archivo");
	   emuEdicion=new JMenu("Edicion");
	   //paso 3 crear los JMenBar
	   braMenu=new JMenuBar();
	   //paso 4 agregar los comandos JMenuItem alos menu
	   emuAchivo.add(cmdAbrir);
	   emuAchivo.add(cmdCerrar);
	   emuAchivo.add(cmdSalir);
	   emuEdicion.add(cmdCopiar);
	   emuEdicion.add(cmdPegar);
	   //paso 5 agregar los menus a la barra de menu 
	   braMenu.add(emuAchivo);
	   braMenu.add(emuEdicion);
	   //paso 6 agregar la barra de menus ala ventana
	   setJMenuBar(braMenu);
	   setVisible(true);
		
		

	}

	public static void main(String[] args) {
    
		Mimenu ventana=new  Mimenu();
	}

}

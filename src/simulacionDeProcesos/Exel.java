package simulacionDeProcesos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class Exel implements Runnable{
  
	JProgressBar barExel;
	public static boolean fin=false;
	  public  Exel(JProgressBar barExel){
		  this.barExel=barExel;
		  
	  }
	public void run() {
	int i;

	
		for(i=0;i<=100;i++){
			if(fin==true){
				break;
			}
			barExel.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName()+"Ejecutandose");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fin=false;
		barExel.setForeground(Color.RED);
		System.out.println("Proceso "+Thread.currentThread().getName()+" Finalizado");
		
	}
	
	

}

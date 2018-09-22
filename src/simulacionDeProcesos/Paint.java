package simulacionDeProcesos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class Paint implements Runnable {
	
		JProgressBar barPaint;
		public  static boolean fin=false;
		  public  Paint(JProgressBar barPaint){
			  this.barPaint=barPaint;
			  
		  }
		public void run() {
		int i;
			for(i=0;i<=100;i++){
				if(fin==true){
					break;
				}
				barPaint.setValue(i);
				System.out.println("Proceso "+Thread.currentThread().getName()+"Ejecutandose");
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			fin=false;
			barPaint.setForeground(Color.RED);
			System.out.println("Proceso "+Thread.currentThread().getName()+" Finalizado");
			
		}

}

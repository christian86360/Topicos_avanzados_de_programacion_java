package simulacionDeProcesos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class Word implements Runnable {
	JProgressBar barWord;
	public static  boolean fin=false;
	  public  Word(JProgressBar barWord){
		  this.barWord=barWord;
		  
	  }
	public void run() {
	int i;
		for(i=0;i<=100;i++){
			if(fin==true){
				break;
			}
			barWord.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName()+"Ejecutandose");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fin=false;
		barWord.setForeground(Color.RED);
		System.out.println("Proceso "+Thread.currentThread().getName()+" Finalizado");
		
	}

}

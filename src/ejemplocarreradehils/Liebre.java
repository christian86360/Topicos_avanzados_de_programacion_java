package ejemplocarreradehils;

public class Liebre extends Thread {
	public void run(){
		int i=0;
		long ms=0;
		System.out.println("Comienza la liebre");
		while(i<5){
			try {
				ms=(long)(Math.random()*5+1)*1000;
				Thread.sleep(ms);
				System.out.println("Liebre Corriendo a "+ms+" Metros x segundo");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			i++;
			
		}
		System.out.println("Termina la liebre");
	}

}

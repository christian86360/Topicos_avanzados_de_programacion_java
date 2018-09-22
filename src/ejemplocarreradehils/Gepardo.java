package ejemplocarreradehils;

public class Gepardo extends Thread{
	public void run(){
		int i=0;
		long ms=0;
		System.out.println("Comienza la Gepardo");
		while(i<5){
			try {
				ms=(long)(Math.random()*5+1)*1000;
				Thread.sleep(ms);
				System.out.println("Gepardo Corriendo a "+ms+" Metros x segundo");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			i++;
			
		}
		System.out.println("Termina la Gepardo");
	

}


}

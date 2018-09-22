package hilosrunnable;

public class HilosRunnable implements Runnable{
long ms=0;
	@Override
	public void run() {
		ms=(long)(Math.random()*6)*1000;
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		                               
		System.out.println("Proceso "+ Thread.currentThread().getName()+" Finalizado en "+ ms + " Milesegundos");
	}

}

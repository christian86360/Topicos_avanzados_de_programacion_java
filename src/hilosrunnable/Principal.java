package hilosrunnable;

public class Principal {

	public static void main(String[] args) {
		HilosRunnable h=new HilosRunnable();
		Thread proceso1=new Thread(h,"Word");
		Thread proceso2=new Thread(h,"Powe Point");
		Thread proceso3=new Thread(h,"Paint");
		Thread proceso4=new Thread(h,"Exel");
		proceso1.start();
		proceso2.start();
		proceso3.start();
		proceso4.start();
	}

}

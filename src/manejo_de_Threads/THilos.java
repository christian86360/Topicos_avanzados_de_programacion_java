package manejo_de_Threads;

public class THilos extends Thread {
	// metodo run encargado de realizar la acciones
	private String proceso;
	private long ms = 0;

	public void run() {
		try {
			ms = (long) (Math.random() * 6) * 1000;
			Thread.sleep(ms);
		} catch (Exception e) {

			System.out.println("Error de ejecucion");
		}
		System.out.println("Proceso " + proceso + " Finalizado en " + ms + " Milesegundos");

	}

	public THilos(String proceso) {
		this.proceso = proceso;

	}

}

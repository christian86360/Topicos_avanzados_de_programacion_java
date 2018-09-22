package ejemplocarreradehils;

public class Principal {

	public static void main(String[] args) {
		Liebre liebre=new Liebre();
		Tortuga tortuga=new Tortuga();
		Gepardo gepardo=new Gepardo();
		
		Thread Ht=new Thread(liebre);
		Thread Hl=new Thread(tortuga);
		Thread Hi=new Thread(gepardo);
		
		Ht.start();
		Hl.start();
		Hi.start();
		
		System.out.println("Comienza la carrera");
		

	}

}

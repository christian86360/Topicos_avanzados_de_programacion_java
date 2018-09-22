package manejo_de_Threads;

public class Hilos {

	public static void main(String[] args){
		THilos proceso1=new THilos("Word");
		THilos proceso2=new THilos("Exel");
		THilos proceso3=new THilos("Paint");
		THilos proceso4=new THilos("Reloj");
		THilos proceso5=new THilos("Nexus");
		proceso1.start();
		proceso2.start();
		proceso3.start();
		proceso4.start();
		proceso5.start();
	}
}

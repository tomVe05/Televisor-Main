package Package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor TV1 = new Televisor();
		
		TV1.setMarca("Samsung");
		
		TV1.setTamaño(73);
		
		TV1.setEncendido("On");
		
		TV1.setVolumen(50);
		
		TV1.setCanal(1522);
		
		System.out.println("La marca de mi televisor es: " + TV1.getMarca());
		
		System.out.println("Las pulgadas de mi televisor son: " + TV1.getTamaño() + "''");
		
		System.out.println("Mi televisor está: " + TV1.getEncendido());
		
		System.out.println("El volumen de mi televisor está: " + TV1.getVolumen());
		
		System.out.println("El canal es: " + TV1.getCanal() + " Win Sports +");
		
	}
	
}
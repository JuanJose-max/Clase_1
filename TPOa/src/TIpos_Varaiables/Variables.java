package TIpos_Varaiables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		int numero, edad, caso = 12 ; // variables enteras
		char sexo = 'f'; 
		boolean flag = true; //variable logica false / true
		double precio = 45.4;
		float cantidad = 77.7f; 
		String nombre = "soraya";
		
		System.out.println("El costo es de " + precio);
		System.out.println("El costo es de " + cantidad + "Total");
		
		Scanner captura = new Scanner(System.in); 
		
		while(flag) {
		
			System.out.println("Seleccione MENU una opcion");
			System.out.println("Suma 1");
			System.out.println("Resta 2");
			System.out.println("Salir 3");
			int op = captura.nextInt();
	
	
			int result, num1, num2;
			
			switch(op) {
				case 1:
					System.out.println("Valor 1");	
					 num1 = captura.nextInt();
					System.out.println("Valor 2");	
					 num2 = captura.nextInt();
					result = num1 + num2;
					System.out.println(result);
					break;
				case 2:
					System.out.println("Valor 1");	
					num1 = captura.nextInt();
					System.out.println("Valor 2");	
					num2 = captura.nextInt();
					result = num1 - num2;
					System.out.println("resultado"+ result);
					break;
				case 3:
					flag = false;
					break;
					
			}
		}
	}
}	


package prac2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner; 
public class distancias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double x1 = 0, x2 = 0, x3 = 0,y1 = 0, y2 = 0, y3 = 0;
	double AB , BC , CA, CAAB;
	final double EPSILON = 0.0001; 

	Scanner captura = new Scanner(System.in); 
	
	System.out.print("Ingrese las cordenadas de el punto A \nx1:");
	x1 = captura.nextDouble();	
	System.out.print("y1:");
	y1= captura.nextDouble();
	
	System.out.print("Ingrese las cordenadas de el punto B \nx2:");
	x2 = captura.nextDouble();
	System.out.print("y2:");
	y2 = captura.nextDouble();
	
	System.out.print("Ingrese las cordenadas de el punto C \nx3:");
	x3 = captura.nextDouble();
	System.out.print("y3:");
	y3 = captura.nextDouble();
	
	AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	BC = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	CA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	
	String formateado = String.format("%.2f", AB); // %.2f para dos decimales
	System.out.println("El resultado de AC es:" + formateado);
	
	String formateado1 = String.format("%.2f", BC); // %.2f para dos decimales
	System.out.println("El resultado de AC es:" + formateado1);
	
	String formateado11 = String.format("%.2f", CA); // %.2f para dos decimales
	System.out.println("El resultado de AC es:" + formateado11);

		

if (Math.abs(AB - BC) < EPSILON && Math.abs(BC - CA) < EPSILON) {
System.out.println("El triángulo es equilátero");
} else if (Math.abs(AB - BC) < EPSILON || Math.abs(BC - CA) < EPSILON || Math.abs(CA - AB) < EPSILON) {
System.out.println("El triángulo es isósceles");
} else {
System.out.println("El triángulo es escaleno");
}

double AB2 = AB * AB, BC2 = BC * BC, CA2 = CA * CA;
if (Math.abs(AB2 + BC2 - CA2) < EPSILON ||
Math.abs(AB2 + CA2 - BC2) < EPSILON ||
Math.abs(BC2 + CA2 - AB2) < EPSILON) {
System.out.println("Además, el triángulo es rectángulo");
		        
		    }
		}
	}



package super_clase;

public class Auto {
	int cantidad_puertas ;
	String color ;
	int velocidades ;
	String motr;
	//Constructor
	public Auto(int cant_puertas, String color) {
		this.color = color; 
		this.cantidad_puertas = cant_puertas;
	}
	
	public void avanza() {		
		System.out.println("El auto avanzando...");
	}
	
	public double reversa(double dato) {
		double velocidad =5.3, resultado;
		resultado = velocidad * dato;
		return resultado;
	}
	
	public static void main(String[] args) {
		Auto auto = new Auto(4,"Verde");
		System.out.println(auto.color);
		auto.avanza();
		double velo = auto.reversa(8.8);
		System.out.println("Velocdad"+ velo);
	} 
}

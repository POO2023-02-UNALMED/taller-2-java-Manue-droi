package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if (color == "rojo" || color == "amarillo" || color == "negro" || color == "blanco") {
			this.color = color;
		}
				
	}
}

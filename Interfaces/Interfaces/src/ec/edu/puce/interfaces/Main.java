package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(7);
		rectangulo.setAltura(15);
		System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(5);
		triangulo.setAltura(8);
		System.out.println("Area del Triangulo: " + triangulo.calcularArea());
		
		Circulo circulo = new Circulo();
		
		circulo.setRadio(10);
		System.out.println("Area del Circulo: " + circulo.calcularArea());
		
		

	}

}

package ejercicio2;
import java.util.Scanner;

public class Circunferencia {
	private double radio;
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		double area;
		area = Math.PI * (radio * radio);
		return area;
	}
	
	public double perimetro() {
		double perimetro;
		perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	
	public static void main(String[] args){
		Circunferencia circur1 = new Circunferencia(2.33);
		System.out.println(circur1.getRadio());
		System.out.println(circur1.area());
		System.out.println(circur1.perimetro());
		circur1.setRadio(12.22);
		System.out.println(circur1.getRadio());
		System.out.println(circur1.area());
		System.out.println(circur1.perimetro());
	}
}

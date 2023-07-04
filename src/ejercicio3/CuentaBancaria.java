package ejercicio3;
import java.util.Scanner;

public class CuentaBancaria {
	protected int numero;
	protected int dni;
	protected double saldo;
	Scanner teclado = new Scanner(System.in);
	
	public CuentaBancaria() {
		System.out.print("Ingresa el número de la cuenta: ");
		numero = teclado.nextInt();
		System.out.print("Ingrese su dni: ");
		dni = teclado.nextInt();
		System.out.print("Ingrese su saldo actual: ");
		saldo = teclado.nextDouble();
	}
	
	public CuentaBancaria(int numero, int dni, double saldo) {
		this.numero = numero;
		this.dni = dni;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double ingreso) {
		if (ingreso < 0) {
			
		}else {
			saldo = saldo + ingreso;
		}
	}
	
	public double extraccionRapida() {
		double extraccion = (20 * saldo) / 100;
		return extraccion;
	}
	
	public void consultarSaldo() {
		System.out.println("Tu saldo actual es: " + saldo);
	}
	
	public void consultarDatos() {
		System.out.println("Datos de la cuenta // Número: " + numero + " - Dni: " + dni + " - Saldo: " + saldo);
	}
}


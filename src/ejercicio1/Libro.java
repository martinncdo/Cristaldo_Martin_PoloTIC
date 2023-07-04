package ejercicio1;
import java.util.Scanner;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	Scanner teclado = new Scanner(System.in);
	
	public Libro(int isbn, String titulo, String autor, int numPaginas) {
		this.ISBN = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public Libro() {
		System.out.print("Ingrese el ISBN del libro: ");
		this.ISBN = teclado.nextInt();
		System.out.print("Ingrese el título del libro: ");
		teclado.nextLine();
		this.titulo = teclado.nextLine();
		System.out.print("Ingrese el nombre del autor: ");
		this.autor = teclado.nextLine();
		System.out.print("Ingrese el número de páginas del libro: ");
		this.numPaginas = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("ISBN: " + this.ISBN + " / título: " + this.titulo + " / autor: " + this.autor + " / número de páginas: " + this.numPaginas);
	}
	
	public static void main(String[] args) {
		Libro libro1 = new Libro(190, "Misionerita", "Cristaldo Martín", 564);
		libro1.imprimir();
		Libro libro2 = new Libro();
		libro2.imprimir();
	}
}

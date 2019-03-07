import java.util.Scanner;

public class Empleado {
	
	private Scanner teclado;
	String nombre;
	int sueldo;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese el sueldo: ");
		sueldo = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println(nombre);
		System.out.println(sueldo);
	}
	
	public void impuestos() {
		if (sueldo > 3000) {
			System.out.println("Debe pagar impuestos.");
		}
		else {
			System.out.println("No debe pagar impuestos.");
		}
	}
	
	public static void main(String[] args) {
		Empleado empleado1;
		empleado1 = new Empleado();
		empleado1.inicializar();
		empleado1.imprimir();
		empleado1.impuestos();
	}
}

import java.util.Scanner;

public class Operacion {
	
	private Scanner teclado;
	float num1, num2, suma, resta, multiplicacion, division;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese primer numero: ");
		num1 = teclado.nextFloat();
		System.out.print("Ingrese segundo numero: ");
		num2 = teclado.nextFloat();
	}

	public void sumar() {
		suma = num1 + num2;
	}
	
	public void restar() {
		resta = num1 - num2;
	}
	
	public void multiplicar() {
		multiplicacion = num1 * num2;
	}
	
	public void dividir() {
		division = num1 / num2;
	}
	
	public void imprimir() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}
	
	public static void main(String[] args) {
		Operacion operacion1;
		operacion1 = new Operacion();
		operacion1.inicializar();
		operacion1.sumar();
		operacion1.restar();
		operacion1.multiplicar();
		operacion1.dividir();
		operacion1.imprimir();
	}	
}

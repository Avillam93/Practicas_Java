import java.util.Scanner;

public class TablaDeMultiplicar {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int i, numero, resultado;
		System.out.print("Inserte el numero a multiplicar: ");
		numero = teclado.nextInt();
		
		for (i = 1; i <= 12; i++) {
			resultado = numero * i;
			System.out.println(i + " * " + numero + " = " + resultado);
		}
	}
}

import java.util.Scanner;

public class SumaProductoTresValoresIguales {

	public static void main (String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, suma, producto;
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			suma = num1 + num2;
			producto = suma * num3;
			System.out.println("Los numeros son iguales.");
			System.out.println("El resultado de la suma de los dos primeros numeros es: " + suma);
			System.out.println("El resultado de la multiplicacion de la suma anterior por el tercer numero es: " + producto);
		}
		else {
			System.out.println("Los numeros no son iguales.");
		}
	}
}

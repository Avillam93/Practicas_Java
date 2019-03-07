import java.util.Scanner;

public class NumeroMayorTresNumeros {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el tercer numero: "); 
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El primer numero es mayor: " + num1);
		}
		else {
			if (num2 > num3) {
				System.out.println("El segundo numero es mayor: " + num2);
			}
			else {
				System.out.println("El tercer numero es mayor: " + num3);
			}
		}
	}
}

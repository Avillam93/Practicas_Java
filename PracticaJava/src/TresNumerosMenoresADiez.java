import java.util.Scanner;

public class TresNumerosMenoresADiez {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Inserte el primer numero: ");
		num1 = teclado.nextInt();
		System.out.print("Inserte el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.print("Inserte el tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Los numeros son menores de 10.");
		}
		else {
			System.out.println("Los numeros no son menores de 10.");
		}
	}
}

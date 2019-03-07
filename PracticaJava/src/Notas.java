import java.util.Scanner;

public class Notas {
	
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, nota3, promedio;
		System.out.print("Ingrese la primer nota: ");
		nota1 = teclado.nextFloat();
		System.out.print("Ingrese la segunda nota: ");
		nota2 = teclado.nextFloat();
		System.out.print("Ingrese la tercer nota: ");
		nota3 = teclado.nextFloat();
		promedio = (nota1 + nota2 + nota3) / 3;
		if (promedio >= 7) {
			System.out.println("El estudiante aprobo con: " + promedio);
		}
		else {
			System.out.println("El estudiante reprobo con: " + promedio);
		}
	}
}

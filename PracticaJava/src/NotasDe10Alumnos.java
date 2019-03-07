import java.util.Scanner;

public class NotasDe10Alumnos {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int i, nota, aprueba = 0, reprueba = 0;
		
		for(i=1; i<10; i++) {
			System.out.print("Inserte la nota del alumno: ");
			nota = teclado.nextInt();
			if (nota >= 7) {
				aprueba = aprueba + 1;
			}
			else {
				reprueba = reprueba + 1;
			}
		}
		System.out.println("La cantidad de alumnos que aprueba es: " + aprueba);
		System.out.println("La cantidad de alumnos que reprueba es: " + reprueba);
	}
}

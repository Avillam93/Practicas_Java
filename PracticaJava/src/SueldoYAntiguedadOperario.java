import java.util.Scanner;

public class SueldoYAntiguedadOperario {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float sueldo, antiguedad, aumento;
		System.out.print("Inserte sueldo del operario: ");
		sueldo = teclado.nextInt();
		System.out.print("Inserte antiguedad del operario: ");
		antiguedad = teclado.nextInt();
		
		if (sueldo < 500 && antiguedad >= 10) {
			aumento = sueldo* 0.20f;
			sueldo = sueldo + aumento;
			System.out.println("El sueldo es: " + sueldo);
		}
		else {
			if (sueldo < 500 && antiguedad < 10) {
				aumento = sueldo* 0.05f;
				sueldo = sueldo + aumento;
				System.out.println("El sueldo es: " + sueldo);

		}
			else {
				if (sueldo >= 500) {
					System.out.println("El sueldo es: " + sueldo);
				}
			}
		}
	}
}

import java.util.Scanner;

public class PrimerTrimestre {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("unused")
		int dia, mes, año;
		System.out.print("Ingrese el dia: ");
		dia = teclado.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = teclado.nextInt();
		System.out.print("Ingrese el año: ");
		año = teclado.nextInt();
		
		if (mes <= 3) {
			System.out.println("Corresponde al primer trimestre del año.");
		}
		else {
			System.out.println("No corresponde al primer trimestre del año.");
		}
	}
}

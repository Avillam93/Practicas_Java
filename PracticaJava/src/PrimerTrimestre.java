import java.util.Scanner;

public class PrimerTrimestre {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("unused")
		int dia, mes, a�o;
		System.out.print("Ingrese el dia: ");
		dia = teclado.nextInt();
		System.out.print("Ingrese el mes: ");
		mes = teclado.nextInt();
		System.out.print("Ingrese el a�o: ");
		a�o = teclado.nextInt();
		
		if (mes <= 3) {
			System.out.println("Corresponde al primer trimestre del a�o.");
		}
		else {
			System.out.println("No corresponde al primer trimestre del a�o.");
		}
	}
}

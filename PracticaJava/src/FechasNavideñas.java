import java.util.Scanner;

public class FechasNavide�as {

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
		
		if (mes == 12) {
			System.out.println("Es navidad");
		}
		else {
			System.out.println("No es navidad");
		}
	}
}

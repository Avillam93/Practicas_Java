import java.util.Scanner;

public class Del1AlValorIngresado {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x = 1, y;
		System.out.print("Inserte el numero: ");
		y = teclado.nextInt();
		while (x <= y) {
			System.out.println(x);
			x = x + 1;
		}
	}
}

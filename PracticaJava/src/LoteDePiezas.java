import java.util.Scanner;

public class LoteDePiezas {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x = 0, cantidad, aptas = 0;
		float pieza;
		System.out.print("Inserte cantidad: ");
		cantidad = teclado.nextInt();
		
		while (x < cantidad) {
			System.out.print("Inserte numero: ");
			pieza = teclado.nextFloat();
			if (pieza >= 1.20 && pieza <= 1.30) {
				aptas = aptas + 1;
			}
			x = x + 1;
		}

		System.out.println("La cantidad de piezas aptas son: " + aptas);
	}
}

import java.util.Scanner;

public class PosicionEnCuadrante {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x, y;
		System.out.print("Inserte el punto x: ");
		x = teclado.nextInt();
		System.out.print("Inserte el punto y: ");
		y = teclado.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Los puntos se encuentran en el 1° cuadrante.");
		}
		else {
			if (x < 0 && y > 0) {
				System.out.println("Los puntos se encuentran en el 2° cuadrante.");
			}
			else {
				if (x < 0 && y < 0) {
					System.out.println("Los puntos se encuentran en el 3° cuadrante.");
				}
				else {
					if (x > 0 && y < 0) {
						System.out.println("Los puntos se encuentran en el 4° cuadrante.");
					}
				}
			}
		}
	}
}

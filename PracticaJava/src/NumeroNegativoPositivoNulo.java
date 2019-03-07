import java.util.Scanner;

public class NumeroNegativoPositivoNulo {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese el numero: ");
		num = teclado.nextInt();
		
		if (num == 0) {
			System.out.println("El numero es nulo");
		}
		else {
			if (num < 0) {
				System.out.println("El numero es negativo");
			}
			else {
				System.out.println("El numero es positivo");
			}
		}
	}

}

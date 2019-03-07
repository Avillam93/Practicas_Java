import java.util.Scanner;

public class SumaVectores {

	private Scanner teclado;
	private int[] v1, v2, v3;
	
	public void inicizalizarVectores() {
		teclado = new Scanner(System.in);
		v1 = new int[4];
		v2 = new int[4];
		for(int f = 0; f <= 3; f++) {
			System.out.print("Ingrese valores del vector 1: ");
			v1[f] = teclado.nextInt();
		}
		for(int f = 0; f <= 3; f++) {
			System.out.print("Ingrese valores del vector 2: ");
			v2[f] = teclado.nextInt();
		}
	}
		
	public void sumaVectores() {
		v3 = new int[4];
		for(int f = 0; f <= 3; f++) {
			v3[f] = v1[f] + v2[f];
		}
	}
	
	public void imprimirVectores() {
		for(int f = 0; f <= 3; f++) {
			System.out.println("Vector 1 posicion " + f + " = " + v1[f]);
		}
		for(int f = 0; f <= 3; f++) {
			System.out.println("Vector 2 posicion " + f + " = " + v2[f]);
		}
		for(int f = 0; f <= 3; f++) {
			System.out.println("Vector 3 posicion " + f + " = " + v3[f]);
		}
	}
	
	public static void main(String[] args) {
		SumaVectores sv = new SumaVectores();
		sv.inicizalizarVectores();
		sv.sumaVectores();
		sv.imprimirVectores();
	}
}

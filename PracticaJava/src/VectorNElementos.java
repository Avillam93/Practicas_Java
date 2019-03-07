import java.util.Scanner;

public class VectorNElementos {

	private Scanner teclado;
	private int[] vector;
	private int cant, suma;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Tamaño del vector: ");
		cant = teclado.nextInt();
		vector = new int[cant];
		for(int f = 0; f < vector.length; f++) {
			System.out.print("Ingrese valores: ");
			vector[f] = teclado.nextInt();
		}
	}
	
	public void sumar() {
		for(int f = 0; f < vector.length; f++) {
			suma = suma + vector[f];
		}
	}
	
	public void imprimir() {
		System.out.println("La suma de los elementos del vector es: " + suma);
	}
	
	public static void main(String[] args) {
		VectorNElementos vector1 = new VectorNElementos();
		vector1.inicializar();
		vector1.sumar();
		vector1.imprimir();		
	}
}


import java.util.Scanner;

public class TestCapacitacion {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int cantidadTotal, cantidadErronea;
		float porcentaje, cantidadCorrectas;
		System.out.print("Ingresar cantidad total de preguntas: ");
		cantidadTotal = teclado.nextInt();
		System.out.print("Ingresar cantidad erronea: ");
		cantidadErronea = teclado.nextInt();
		cantidadCorrectas = cantidadTotal - cantidadErronea;
		porcentaje = cantidadCorrectas / cantidadTotal;

		if (porcentaje >= 0.90) {
			System.out.println("Nivel maximo con " + (int)cantidadCorrectas + " respuestas correctas para un porcentaje de " + (int)( porcentaje*100) + "%");
		} 
		else {
			if (porcentaje >= 0.75 && porcentaje < 0.90) {
				System.out.println("Nivel medio con " + (int)cantidadCorrectas + " respuestas correctas para un porcentaje de " + (int)( porcentaje*100) + "%");
			}
			else {
				if (porcentaje >= 0.50 && porcentaje < 0.75) {
					System.out.println("Nivel bajo con " + (int)cantidadCorrectas + " respuestas correctas para un porcentaje de " + (int)( porcentaje*100) + "%");
			}
				else {
					System.out.println("Fuera de nivel con " + (int)cantidadCorrectas + " respuestas correctas para un porcentaje de " + (int)( porcentaje*100) + "%");
					}
			}
		}	
	}
}

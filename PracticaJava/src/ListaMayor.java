import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaMayor {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int i = 1, j = 1, valor, total1 = 0, total2 = 0;

		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
			
		while (i <= 15) {	
		System.out.print("Ingrese valores de la lista 1: ");
		valor = teclado.nextInt();
		lista1.add(valor);
		total1= total1 + valor;
		i = i + 1;
		}
		System.out.println(lista1);

		while (j <= 15) {	
		System.out.print("Ingrese valores de la lista 2: ");
		valor = teclado.nextInt();
		lista2.add(valor);
		total2= total2 + valor;
		j = j + 1;
		}
		System.out.println(lista2);
		
		if (total1 > total2) {
			System.out.println("La lista 1 es mayor.");
		} 
		else {
			System.out.println("La lista 2 es mayor.");
		}
	}
}

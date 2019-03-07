import java.util.Scanner;
public class ConstructorOperarios {
private Scanner teclado;
private int[] sueldos;

	public ConstructorOperarios() {
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0;f<5;f++) {
			System.out.print("Ingrese valor: ");
				sueldos[f]=teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for(int f=0;f<5;f++) {
			System.out.println(sueldos[f]);
		}
	}
	
	public static void main(String[] ar) {
		ConstructorOperarios cop=new ConstructorOperarios();
		cop.imprimir();
	}
}
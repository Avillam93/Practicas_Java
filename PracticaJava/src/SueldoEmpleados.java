import java.util.Scanner;

public class SueldoEmpleados {
	
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int i = 1, empleados, sueldo, entre = 0, masDe = 0, total = 0;
		
		System.out.print("Ingrese cantidad de empleados: ");
		empleados = teclado.nextInt();
		
		while (i <= empleados) {
			System.out.print("Ingrese sueldo del empleado: ");
			sueldo = teclado.nextInt();
			if (sueldo >= 100 && sueldo <= 300) {
				entre = entre + 1;
				total = total + sueldo;
			} else {
				if (sueldo > 300) {
					masDe = masDe + 1;
					total = total + sueldo;
				}
			}
			i = i + 1;
		}
		System.out.println("Los empleados que ganan entre 100 y 300 son: " + entre);
		System.out.println("Los empleados que ganan mas de 300 son: " + masDe); 
		System.out.println("La empresa gasta " + total + " pagando los sueldos a sus empleados");
	}
}

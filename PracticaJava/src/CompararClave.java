import java.util.Scanner;

public class CompararClave {

	Scanner teclado =new Scanner(System.in);
	String clave;
	
	public CompararClave() {
		System.out.print("Inserte clave: ");
		clave = teclado.nextLine();
	}
	
	public void imprimir() {
		if (clave.equals("123abc")) {
			System.out.println("La contrase�a es correcta.");
		}
		else {
			System.out.println("La contrase�a es incorrecta.");
		}
	}
	
	public static void main(String[] args) {
		CompararClave cc = new CompararClave();
		cc.imprimir();
	}
}

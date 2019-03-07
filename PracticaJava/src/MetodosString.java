import java.util.Scanner;

public class MetodosString {

	Scanner teclado =new Scanner(System.in);
	String cadena, mitad;
	char ultimo;
	
	public MetodosString() {
		System.out.print("Inserte la cadena: ");
		cadena = teclado.nextLine();
	}
	
	public void imprimirPrimeraMitad() {
		mitad = cadena.substring(0,cadena.length()/2);
        System.out.println("Primer mitad: " + mitad);
	}
	
	public void ultimoCaracter() {
	    ultimo = cadena.charAt(cadena.length()-1);
	    System.out.println("Ultimo caracter: " + ultimo);
	}
	
	public void formaInversa() {
	    System.out.print("Impresión en forma inversa: ");
	    for(int f = cadena.length()-1; f >= 0; f--) {
	    System.out.print(cadena.charAt(f));
	    }
	    System.out.println();
	}
	 
	public void conGuion() {
	    System.out.print("Separado por guiones: ");
	    for(int f = 0; f<cadena.length(); f++) {
	        System.out.print(cadena.charAt(f) + "-");
	    }
	    System.out.println();
	}
	 
	public void cantidadVocales() {
        int cant = 0;
		for(int f = 0; f<cadena.length(); f++) {
			if (cadena.charAt(f)=='a' || cadena.charAt(f)=='e' || 
	            cadena.charAt(f)=='i' || cadena.charAt(f)=='o' || 
	            cadena.charAt(f)=='u' || cadena.charAt(f)=='A' || 
	            cadena.charAt(f)=='E' || cadena.charAt(f)=='I' || 
	            cadena.charAt(f)=='O' || cadena.charAt(f)=='U') {
	            cant++;
	            }
	        }
		System.out.println("Cantidad de vocales: " + cant);
	}
	 
	public void esCapicua() {
        int cant = 0;
        for(int f = 0; f<cadena.length() / 2; f++) {
            if (cadena.charAt(f) == cadena.charAt(cadena.length()-1-f)) {
                cant++;
            }            	
        }
        if (cant == cadena.length() / 2) {
            System.out.println("Es capicúa la cadena: " + cadena);
        } else {
            System.out.println("No es capicúa la cadena: " + cadena);        
        }
    }
	
	public static void main(String[] args) {
		MetodosString ms = new MetodosString();
		ms.imprimirPrimeraMitad();
		ms.ultimoCaracter();
		ms.formaInversa();
		ms.conGuion();
		ms.cantidadVocales();
		ms.esCapicua();
	}
}

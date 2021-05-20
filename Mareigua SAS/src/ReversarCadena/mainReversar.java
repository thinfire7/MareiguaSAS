package ReversarCadena;

import java.util.Scanner;

public class mainReversar {

	public static void main(String[] args) {

		Scanner tf = new Scanner(System.in);
		
		System.out.println("Ingrese la cadena");
		String cadena= tf.nextLine();
		String invertida="";
		
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			System.out.println(cadena.charAt(i));
			invertida = invertida + cadena.charAt(i);
		}
		
		System.out.println(invertida);
	}
	

}

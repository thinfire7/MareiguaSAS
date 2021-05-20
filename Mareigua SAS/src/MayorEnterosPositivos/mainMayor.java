package MayorEnterosPositivos;

import java.util.Scanner;

public class mainMayor {
	
	public static int mayorDelArreglo(int arreglo[]) {
		int mayor =0;
		
		for (int i = 0; i < arreglo.length; i++) {
			
			if(arreglo[i]>mayor) {
				mayor=arreglo[i];
			}
		}
		return mayor;
	}

	public static void main(String[] args) {
		
		Scanner tf = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del arreglo");
		int tam = tf.nextInt();
		
		int arreglo[] = new int[tam];
		
		for (int i = 0; i < arreglo.length; i++) {
			
			arreglo[i] = (int) Math.floor(Math.random()*100+1);
			System.out.println(arreglo[i]);
		}
		
		System.out.println("el numero mayor es: " + mayorDelArreglo(arreglo));
	}

}

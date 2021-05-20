package Multiplos;

public class mainMultiplos {
	
	public static boolean multiplo(int numero, int multiplo){
		
		if(numero%multiplo==0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			String impre=String.valueOf(i);
			
			if(multiplo(i,3)) {
				impre="mare";				
			}
			
			if(multiplo(i,5)) {
				if(impre=="mare") {
					impre+="igua";
				}
				else{
					impre="igua";
				}
			}
			
			System.out.println(i + ": " + impre);
		}

	}

}

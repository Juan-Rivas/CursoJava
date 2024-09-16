package es.cursojava.inicio.bucles;

public class EjemploBucleFor {
	public static void main(String[] args) {
		//1ª Parte: declaramos e inicializamos una o más variables
		//2ª Parte: establecemos la condición por la que el bucle continuará iterando
		//3ª Parte: como cambia la variable o variables definidas por cada iteracción
		for (int i=0;  i<100  ;  i++  ) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
			if (i>=10) {
				break;
			}
		}
		System.out.println("FIN");
	}
}

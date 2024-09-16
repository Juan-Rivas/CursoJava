package es.cursojava.inicio.bucles;

public class EjerciciosBucles {

	public static void main(String[] args) {
		//Pintar la tabla de multiplicar de un numero
		int numero = 4;
		for (int i=1;  i<11  ;  i++  ) {
			System.out.println(numero + "x" + i + "=" + (numero*i));
		}
		
		//Pintar las tablas de multiplicar de los numeros del 1-10
		for (int i=1;  i<11  ;  i++  ) {
			System.out.println("Tabla del " + i);
			for (int y=1;  y<11  ;  y++  ) {
				System.out.println(i + "x" + y + "=" + (i*y));
			}
		}
		
		//Mostrar los 10 primeros números de la Serie de Fibonacci: siempre la suma de los dos anteriores números a partir del 1
		//0,1,1,2,3,5,8,13
		int numero1 = 0;
		int numero2 = 1;
		int fibonacci = 0; 
		String lista = ""; 
		lista = numero1 + "," + numero2;
		System.out.println("Primeros 10 números lista fibonacci");
		for (int i = 2; i < 10; i++) {
			fibonacci = numero1 + numero2;
			lista=lista + "," + fibonacci;
			numero1 = numero2;
			numero2 = fibonacci;
		}
		System.out.println(lista);
	}
}
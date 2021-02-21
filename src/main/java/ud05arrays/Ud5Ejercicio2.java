package ud05arrays;

public class Ud5Ejercicio2 {

	/**
	 * Crea un programa que dado un numero N, que se recibe como parametro a traves
	 * de String[] args genere un array de enteros con los N primeros terminos de la sucesion
	 * de Fibonacci
	 * 
	 * La sucesion de Fibonacci tiene fijos los dos primeros terminos fijos
	 * F(0) = 0
	 * F(1) = 1
	 * 
	 * A partir del tercero se generan en base a los anteriores
	 * F(N) = F(N-2) + F (N-1)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numTerminos = Integer.parseInt(args[0]);
		
		long[] sucesion = fibonacci(numTerminos);
		
		for (long i : sucesion)
			System.out.print(i + " ");
	}
	
	/**
	 * Crea un array con N terminos y en cada posicion guarda el numero de fibonnaci 
	 * correspondiente
	 * 
	 * Ejemplos: 
	 * 
	 * fibonacci(5) = [0,1,1,2,3]
	 * fibonacci(5) = [fibo(0),fibo(1),fibo(2),fibo(3),fibo(4)]
	 * @param terminos longitud del array
	 * @return el array con todos los terminos de fibonacci calculados para cada posicion
	 */
	public static long [] fibonacci (int terminos) {;
		
		return null;
	}
	
	/**
	 * Funcion que dado un numero que representa el termino  enesimo de la sucesion
	 * de Fibonacci, devuelve el valor del mismo
	 * 
	 * Para enesimo = 0 -> 0;
	 * Para enesimo = 1 -> 1;
	 * Para enesimo = N, tal que N > 1 -> fibo(N-2)+fibo(N-1)
	 * 
	 * @param enesimo termino de Fibonacci a calcular
	 * @return valor del termino en la sucesion de Fibonacci
	 */
	public static long fibo(int enesimo) {
		
		return -1;
	}

}

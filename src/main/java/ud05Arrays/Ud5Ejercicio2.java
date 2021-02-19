package ud05Arrays;

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
		
		int[] sucesion = fibonacci(numTerminos);
		
		for (int i : sucesion)
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
	public static int [] fibonacci (int terminos) {
		int [] resultado = new int[terminos];
		
		for (int i = 0; i < resultado.length; i++)
			resultado[i]=fibo(i);
		
		return resultado;
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
	public static int fibo(int enesimo) {
		int valor=0;
		
		if(enesimo==1)
			valor=1;
		else if(enesimo > 1)
			valor = fibo(enesimo-2) + fibo(enesimo-1);
		
		return valor;
	}

}

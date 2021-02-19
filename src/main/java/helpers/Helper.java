package helpers;

/**
 * Clase de utilidad para ayudar a controlar los metodos de ordenamiento
 * a traves de un metodo de intercambio. Helper.swap
 * @author eserrano
 *
 */
public class Helper {
	

	private static int intercambios=0;
	private static long timeStamp;

	private Helper() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * El metodo intercambia los valores de las posiciones i y j en el array
	 * @param array con los valores
	 * @param i valor de intercambio 1
	 * @param j valor de intercambio 2
	 */
	public static void swap(int [] array, int i, int j) {
		
		//intercambia elementos
		int aux = array[i];
		array[i]=array[j];
		array[j]=aux;
		
		//cuenta intercambios
		intercambios++;
	}
	
	/**
	 * El metodo intercambia los valores de las posiciones i y j en el array
	 * @param array con los valores
	 * @param i valor de intercambio 1
	 * @param j valor de intercambio 2
	 */
	public static void swap(Object [] array, int i, int j) {
		
		//intercambia elementos
		Object aux = array[i];
		array[i]=array[j];
		array[j]=aux;
		
		//cuenta intercambios
		intercambios++;
	}
	
	public static void resetIntercambios(long timeStamp) {
		Helper.timeStamp=timeStamp;
		intercambios=0;
	}
	
	public static int getIntercambios() {
		return intercambios;
	}
	
	public static long getTimeStamp() {
		return timeStamp;
	}

}

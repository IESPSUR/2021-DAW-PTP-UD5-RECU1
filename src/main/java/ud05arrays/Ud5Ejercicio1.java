/**
 * 
 */
package ud05arrays;

/**
 * @author eserrano
 *
 */
public class Ud5Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object [][] datosVirus= {
				{"Coronavirus",3,0.125f},
				{"Sarampión",12,0.0001f},
				{"Viruela", 7,0.00015f},
				{"Paperas",4,0.00001f},
				{"Ébola",2,0.199f}
		};
		
		Virus[] arrayVirus = crearArrayVirus(datosVirus);
		
		imprimeVirus(arrayVirus,"Inicial",true);
		
		imprimeVirus(arrayVirus,"Inicial",false);
//		
//		Bola [] ordenado = ordena(bolas);
//		
//		imprimeBolas(ordenado, "Ordenado");
//		
//		Bola [] limpio = eliminaBolas(5f, 5f, bolas);
//		
//		imprimeBolas(limpio,"Limpio");
	}
	
	/**
	 * El método debe crear un nuevo Array de Virus usando los 
	 * datos que se pasan como parametro.
	 * 
	 * @param datosBolas datos de las bolas en array bidimensional de 
	 * numero de filas variable y longitud de columnas = 3,
	 * la primera columna de cada fila tiene el String nombre del virus
	 * la segunda el Integer tasa de reproducción r0
	 * la tercera el Float tasa de letalidad
	 * @return Nuevo array con los Virus creados.
	 */
	public static Virus[] crearArrayVirus(Object[][] datosVirus) {
		Virus [] array = new Virus[datosVirus.length];
		int i=0;
		for (Object[] objects : datosVirus) {
			String nombre = (String)objects[0];
			Integer r0=(Integer)objects[1];
			Float letalidad=(Float)objects[2];
			array[i++]=new Virus(nombre, r0, letalidad);
		}
		return array;
	}
	

	/**
	 * Metodo que Imprime un array de Virus.
	 * 
	 * Se imprimiran los virus que ocupan posicion par si el parametro pares
	 * es true. Ej: 0, 2, 4, 6, ...
	 * 
	 * Se imprimiran los virus que ocupan posición impar si el parametro pares
	 * es false. Ej: 1, 3, 5, 7, ...
	 * 
	 * Por cada virus a imprimir, hacer un print en una linea 
	 * con la informacion que el virus proporciona de forma predeterminada
	 *  en su metodo toString
	 * 
	 * NOTA: Modificar sobrescribiendo el comentario TODO y no modificar ni borrar las lineas ya existentes
	 */
	public static void imprimeVirus(Virus[] array, String titulo, boolean pares) {
		System.out.println(titulo + ": --------------------");
		
		int inicio = pares ? 0 : 1;
		for (int i = inicio; i < array.length; i+=2) {
			System.out.println(array[i]);
		}
		
		System.out.println("-----------------------------");
	}
	
	/**
	 * El metodo ordena UNA COPIA del array que se pasa como parametro
	 * 
	 * El orden ha de ser DESCENDENTE, De Mayor a menor
	 * 
	 * RECUERDA QUE EL METODO TRABAJA SOBRE UNA COPIA
	 * NO DEBE MODIFICAR EL ARRAY ORIGINAL.
	 * PISTA: Clona el array antes de ordenar.
	 * 
	 * @param array A clonar y ordenar
	 * @return copia ordenada del array pasado como parametro
	 */
	public static Bola[] ordena(final Bola[] array) {
		
		return null;
	}
	
	/**
	 * Elimina todas las veces que aparece la bola en un array.
	 * 
	 * Debe devolver un nuevo arrar mas pequeño que se ajuste
	 * perfectamente a los elementos que quedan tras la eliminacion
	 * 
	 * RECUERDA QUE EL METODO TRABAJA SOBRE UNA COPIA
	 * NO DEBE MODIFICAR EL ARRAY ORIGINAL.
	 * PISTA: Clona el array antes de eliminar.
	 * 
	 * @param diametro del elemento a borrar
	 * @param peso del elemento a borrar
	 * @param array array que se clonara y del que se borrara
	 * @return nuevo array con los elementos no eliminados.
	 */
	public static Bola[] eliminaBolas(float diametro, float peso,final Bola[] array) {
		return null;
	}
	
	
	
	

}

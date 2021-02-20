/**
 * 
 */
package ud05Arrays;

import helpers.Helper;

/**
 * @author eserrano
 *
 */
public class Ud5Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float [][] datosBolas= {
				{5f,5f},
				{5.1f,5.1f},
				{4.9f,4.9f},
				{5.1f,5.15f},
				{5.1f,5.05f},
				{5f,5f},
				{5f,5f},
				{3f,1f},
				{4.95f,2.5f},
				{4.9f,4.9f},
				{8f,8f},
				{3f,2f}
		};
		
		Bola[] bolas = crearBolas(datosBolas);
		
		imprimeBolas(bolas,"Inicial");
		
		Bola [] ordenado = ordena(bolas);
		
		imprimeBolas(ordenado, "Ordenado");
		
		Bola [] limpio = eliminaBolas(5f, 5f, bolas);
		
		imprimeBolas(limpio,"Limpio");

	}
	
	/**
	 * El método debe crear un nuevo Array de Bolas usando los 
	 * datos que se pasan como parametro.
	 * 
	 * @param datosBolas datos de las bolas en array bidimensional de 
	 * numero de filas variable y longitud de columnas = 2
	 * @return Nuevo array con las Bolas creadas.
	 */
	public static Bola[] crearBolas(float[][] datosBolas) {
		Bola[] bolas = new Bola[datosBolas.length];
		
		for (int i = 0; i < datosBolas.length; i++) {
			bolas[i]=new Bola(datosBolas[i][0],datosBolas[i][1]);
		}
		
		return bolas;
	}
	

	/**
	 * Metodo que Imprime un array de Bolas.
	 * 
	 * Hay que imprimir una linea con la informacion que la
	 * bola proporciona de forma predeterminada en su metodo toString
	 * 
	 * NOTA: Modificar sobrescribiendo el comentario TODO y no modificar ni borrar las lineas ya existentes
	 */
	public static void imprimeBolas(Bola[] array, String titulo) {
		System.out.println(titulo + ": --------------------");
		
		//TODO sobrescribe el comentario para hacer lo que el metodo pide
		for (Bola bola : array) {
			System.out.println(bola);
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
		Bola []copia = array.clone();
		
		for (int i = 0; i < copia.length-1; i++) {
			for (int j = i+1; j < copia.length; j++) {
				if(copia[i].compareTo(copia[j])<0) {
					Helper.swap(copia, i, j);
				}
			}
		}
		
		return copia;
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
		Bola []copia = array.clone();
		Bola referencia = new Bola(diametro, peso);
		
		int eliminadas=0;
		for (int i = 0; i < copia.length; i++) {
			if(referencia.equals(copia[i])) {
				copia[i]=null;
				eliminadas++;
			}
		}
		
		Bola []nuevo = new Bola[copia.length-eliminadas];
		
		int i = 0;
		for(Bola bola: copia) {
			if(bola!=null)
				nuevo[i++]=bola;
		}
		
		
		return nuevo;
	}
	
	
	
	

}

/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de implementar la b�squeda secuencial. �ste comprueba
 * secuencialmente cada elemento de la lista para el valor objetivo hasta que es
 * encontrado o hasta que todos los elementos hayan sido comparados.
 * 
 * @author Jonathan G Araya
 *
 */
public class SecuencialSearch {

	/**
	 * M�todo que se encarga de realizar una busqueda secuencial en un array de un
	 * n�mero.
	 * 
	 * @param array sobre el que se va a realizar la b�squeda.
	 * @param num   que se buscar� en el arreglo.
	 * @return si el elemento ha sido encontrado.
	 */
	public int secuencialSearch(int array[], int num) {
		int i = 0;

		while (i < array.length) {
			if (array[i] == num) {
				System.out.println("The searched element it's in the index: " + i);
				return num;
			} else {
				i++;
			}
		}
		return -1;
	}
}
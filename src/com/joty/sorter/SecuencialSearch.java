/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de implementar la búsqueda secuencial.
 * 
 * @author Jonathan G Araya
 *
 */
public class SecuencialSearch {

	/**
	 * Método que se encarga de realizar una busqueda secuencial en un array de un
	 * número.
	 * 
	 * @param array sobre el que se va a realizar la búsqueda.
	 * @param num   que se buscará en el arreglo.
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
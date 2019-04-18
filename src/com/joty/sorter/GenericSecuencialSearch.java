/**
 * Clase generica que se encarga de realizar una búqueda secuencial.
 */
package com.joty.sorter;

/**
 * @author Jonathan G Araya
 * @param <T>
 *
 */
public class GenericSecuencialSearch<T extends Comparable<T>> {

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public GenericSecuencialSearch() {
	}

	/**
	 * Método que se encarga de realizar una búsqueda secuencial.
	 * 
	 * @param array sobre el cuál se va a realizar la búsqueda.
	 * @param data  a buscar.
	 * @return el dato encontrado.
	 */
	public T genericSecuencialSearch(T array[], T data) {
		int i = 0;

		while (i < array.length) {

			if (array[i] == data) {
				System.out.println("The searched element it's in the index: " + i);
				return data;
			} else {
				i++;
			}
		}
		System.out.println("The searched element was not found.");
		return data;
	}
}
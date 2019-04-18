/**
 * Clase generica que se encarga de realizar una b�queda secuencial.
 */
package com.joty.sorter;

/**
 * @author Jonathan G Araya
 * @param <T>
 *
 */
public class GenericSecuencialSearch<T extends Comparable<T>> {

	/**
	 * M�todo que se encarga de inicializar la clase.
	 */
	public GenericSecuencialSearch() {
	}

	/**
	 * M�todo que se encarga de realizar una b�squeda secuencial.
	 * 
	 * @param array sobre el cu�l se va a realizar la b�squeda.
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
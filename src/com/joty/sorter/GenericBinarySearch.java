/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar una búsqueda binaria genérica.
 * 
 * @author Jonathan G Araya
 * @param <T>
 */
public class GenericBinarySearch<T extends Comparable<T>> {

	/**
	 * Variables de la clase.
	 */
	private int center;
	private int first;
	private int last;
	private T centerValue;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public GenericBinarySearch() {
	}

	/**
	 * Método que se encarga de recibir un arreglo y un dato a buscar.
	 * 
	 * @param arreglo sobre el cuál va a realizar la búsqueda binaria.
	 * @param data    que va a buscar en el arreglo.
	 * @return
	 */
	public int binarySearch(T arreglo[], T data) {
		first = 0;
		last = ((arreglo.length) - 1);

		while (first < last) {
			center = (int) ((first + last) / 2);
			centerValue = arreglo[center];

			if (data.compareTo(centerValue) == 0) {
				System.out.println("The searched element it's in the index: " + center);
				return center;
			} else if (data.compareTo(centerValue) < 0) {
				last = center - 1;
			} else {
				first = center + 1;
			}
		}
		return -1;
	}
}

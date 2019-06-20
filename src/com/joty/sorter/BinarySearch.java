/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que implementa la búsqueda binaria. La búsqueda binaria funciona en
 * arreglos ordenados. La búsqueda binaria comienza por comparar el elemento del
 * medio del arreglo con el valor buscado. Si el valor buscado es igual al
 * elemento del medio, su posición en el arreglo es retornada. Si el valor
 * buscado es menor o mayor que el elemento del medio, la búsqueda continua en
 * la primera o segunda mitad, respectivamente, dejando la otra mitad fuera de
 * consideración.
 * 
 * @author Jonathan G Araya
 *
 */

public class BinarySearch {

	/**
	 * Variables de la clase.
	 */
	private int center;
	private int first;
	private int last;
	private int centerValue;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public BinarySearch() {
	}

	/**
	 * Método que se encarga de recibir un arreglo y un dato a buscar.
	 * 
	 * @param arreglo sobre el cuál va a realizar la búsqueda binaria.
	 * @param data    que va a buscar en el arreglo.
	 * @return
	 */
	public int binarySearch(int arreglo[], int data) {
		first = 0;
		last = ((arreglo.length) - 1);

		while (first <= last) {
			center = (int) ((first + last) / 2);
			centerValue = arreglo[center];

			if (data == centerValue) {
				System.out.println("The searched element it's in the index: " + center);
				return center;
			} else if (data < centerValue) {
				last = center - 1;
			} else {
				first = center + 1;
			}
		}
		return -1;
	}
}
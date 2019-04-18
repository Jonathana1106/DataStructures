/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que implementa la búsqueda binaria.
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

		while (first < last) {
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

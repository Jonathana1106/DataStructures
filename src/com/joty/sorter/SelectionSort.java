/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante SelectionSort. Su
 * funcionamiento es el siguiente:
 * 
 * Buscar el mínimo elemento de la lista.
 * 
 * 
 * Intercambiarlo con el primero.
 * 
 * Buscar el siguiente mínimo en el resto de la lista.
 * 
 * Intercambiarlo con el segundo.
 * 
 * @author Jonathan G Araya
 *
 */

public class SelectionSort {

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public SelectionSort() {
	}

	/**
	 * Método que se encarga de ordenar un array por medio del SelectionSort.
	 * 
	 * @param array que se desea ordenar.
	 */
	public void selectionSort(int array[]) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
}
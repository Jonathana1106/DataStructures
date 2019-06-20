/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante InsertionSort.
 * Inicialmente se tiene un solo elemento, que obviamente es un conjunto
 * ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma
 * el elemento k+1 y se compara con todos los elementos ya ordenados,
 * deteniéndose cuando se encuentra un elemento menor (todos los elementos
 * mayores han sido desplazados una posición a la derecha) o cuando ya no se
 * encuentran elementos (todos los elementos fueron desplazados y este es el más
 * pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los
 * demás elementos.
 * 
 * @author Jonathan G Araya
 *
 */
public class InsertionSort {

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public InsertionSort() {
	}

	/**
	 * Método que se encarga de realizar el ordenamiento por InsertionSort.
	 * 
	 * @param array
	 */
	public void insertionSort(int array[]) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}
/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante InsertionSort.
 * Inicialmente se tiene un solo elemento, que obviamente es un conjunto
 * ordenado. Despu�s, cuando hay k elementos ordenados de menor a mayor, se toma
 * el elemento k+1 y se compara con todos los elementos ya ordenados,
 * deteni�ndose cuando se encuentra un elemento menor (todos los elementos
 * mayores han sido desplazados una posici�n a la derecha) o cuando ya no se
 * encuentran elementos (todos los elementos fueron desplazados y este es el m�s
 * peque�o). En este punto se inserta el elemento k+1 debiendo desplazarse los
 * dem�s elementos.
 * 
 * @author Jonathan G Araya
 *
 */
public class InsertionSort {

	/**
	 * M�todo que se encarga de inicializar la clase.
	 */
	public InsertionSort() {
	}

	/**
	 * M�todo que se encarga de realizar el ordenamiento por InsertionSort.
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
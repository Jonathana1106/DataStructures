/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante MergeSort.
 * Conceptualmente, el ordenamiento por mezcla funciona de la siguiente manera:
 * 
 * Si la longitud de la lista es 0 ó 1, entonces ya está ordenada.
 * 
 * En otro caso: Dividir la lista desordenada en dos sublistas de
 * aproximadamente la mitad del tamaño.
 * 
 * Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
 * 
 * Mezclar las dos sublistas en una sola lista ordenada.
 * 
 * @author Jonathan G Araya
 *
 */
public class MergeSort {

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public MergeSort() {
	}

	/**
	 * Método que se encarga de recibir un array a ordenar por MergeSort.
	 * 
	 * @param array a ordenar.
	 */
	public void mergeSort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	/**
	 * Método que se encarga de separar el array original en dos subarrays.
	 * 
	 * @param array a separar.
	 * @param left  del array.
	 * @param right del array.
	 */
	private void sort(int array[], int left, int right) {
		if (left < right) {
			int m = (left + right) / 2;

			sort(array, left, m);
			sort(array, m + 1, right);

			merge(array, left, m, right);
		}
	}

	/**
	 * Método que se encarga de hacer la mezcla de los arrays y ordenarlos.
	 * 
	 * @param array
	 * @param left
	 * @param mmiddle
	 * @param right
	 */
	private void merge(int array[], int left, int mmiddle, int right) {

		int sizeL = mmiddle - left + 1;
		int sizeR = right - mmiddle;

		int leftArray[] = new int[sizeL];
		int rightArray[] = new int[sizeR];

		for (int i = 0; i < sizeL; ++i)
			leftArray[i] = array[left + i];
		for (int j = 0; j < sizeR; ++j)
			rightArray[j] = array[mmiddle + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while (i < sizeL && j < sizeR) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < sizeL) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < sizeR) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan G Araya
 *
 */
public class QuickSort {

	/**
	 * Variables de la clase.
	 */
	private int i;
	private int j;
	private int pivot;
	private int aux;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public QuickSort() {
	}

	/**
	 * Método que se encarga de recibir un arreglo a ordenar.
	 * 
	 * @param array que se va a ordenar.
	 */
	public void quickSort(int array[]) {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * Método que realiza el ordenamiento por QuickSort de un arreglo.
	 * 
	 * @param array a ordenar.
	 * @param first elemento del arreglo.
	 * @param last  elemento del arreglo.
	 */
	private void quickSort(int array[], int first, int last) {
		i = first;
		j = last;
		pivot = array[(first + last) / 2];

		do {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
		} while (i <= j);
		if (first < j) {
			quickSort(array, first, j);
		}
		if (i < last) {
			quickSort(array, i, last);
		}
	}

	/**
	 * Método que se encarga de imprimir un arreglo en consola.
	 * 
	 * @param arreglo
	 */
	public void printL(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + ", ");
		}
		System.out.print(arreglo[arreglo.length - 1]);
		System.out.print("]");
		System.out.println(" ");
	}
}
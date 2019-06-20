/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante QuickSort. El
 * algoritmo trabaja de la siguiente forma:
 * 
 * Elegir un elemento del arreglo de elementos a ordenar, al que llamaremos
 * pivote.
 * 
 * Resituar los dem�s elementos de la lista a cada lado del pivote, de manera
 * que a un lado queden todos los menores que �l, y al otro los mayores.
 * 
 * Los elementos iguales al pivote pueden ser colocados tanto a su derecha como
 * a su izquierda, dependiendo de la implementaci�n deseada.
 * 
 * En este momento, el pivote ocupa exactamente el lugar que le corresponder� en
 * la lista ordenada.
 * 
 * La lista queda separada en dos sublistas, una formada por los elementos a la
 * izquierda del pivote, y otra por los elementos a su derecha.
 * 
 * Repetir este proceso de forma recursiva para cada sublista mientras �stas
 * contengan m�s de un elemento.
 * 
 * Una vez terminado este proceso todos los elementos estar�n ordenados.
 * 
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
	 * M�todo que se encarga de inicializar la clase.
	 */
	public QuickSort() {
	}

	/**
	 * M�todo que se encarga de recibir un arreglo a ordenar.
	 * 
	 * @param array que se va a ordenar.
	 */
	public void quickSort(int array[]) {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * M�todo que realiza el ordenamiento por QuickSort de un arreglo.
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
}
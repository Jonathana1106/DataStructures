/**
 * 
 */
package com.joty.sorter;

import com.joty.listas.SimpleLL;

/**
 * Clase que se encarga de realizar un ordenamiento genérico mediante QuickSort.
 * 
 * @author Jonathan G Araya
 *
 */
public class GenericQuickSort<T extends Comparable<T>> {

	/**
	 * Variables de la clase.
	 */
	private int i;
	private int j;
	private T pivot;
	private T temp;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public GenericQuickSort() {
	}

	/**
	 * Método que se encarga de recibir un arreglo a ordenar por QuickSort.
	 * 
	 * @param arreglo sobre el que se va a ejecutar el algoritmo.
	 */
	public void quickSort(SimpleLL<T> arreglo) {
		quickSort(arreglo, 0, arreglo.getSize() - 1);
	}

	/**
	 * Método que se encarga de realizar el ordenamiento por QuickSort.
	 * 
	 * @param arreglo a ordenar.
	 * @param first   elemento de la lista.
	 * @param last    elemento de la lista.
	 */
	private void quickSort(SimpleLL<T> arreglo, int first, int last) {
		i = first;
		j = last;
		pivot = arreglo.getDataIndex((int) ((i + j) / 2));

		do {
			while (arreglo.getData(i).compareTo(pivot) < 0) {
				i++;
			}
			while (arreglo.getData(j).compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				/**************************************************************/
				temp = arreglo.getData(i);
				arreglo.setDataIndex(i, arreglo.getData(j));
				arreglo.setDataIndex(j, temp);
				i++;
				j--;
				/***************************************************************/
			}
		} while (i <= j);
		/***********************/
		if (first < j) {
			quickSort(arreglo, first, j);
		}
		if (i < last) {
			quickSort(arreglo, i, last);
		}
		/**************************/
	}

	/**
	 * Método que se encarga de imprimir un arreglo en consola.
	 * 
	 * @param arreglo
	 */
	public void printL(SimpleLL<T> arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.getSize() - 1; i++) {
			System.out.print(arreglo.getData(i) + ", ");
		}
		System.out.print(arreglo.getData(arreglo.getSize() - 1));
		System.out.print("]");
		System.out.println(" ");
	}
}
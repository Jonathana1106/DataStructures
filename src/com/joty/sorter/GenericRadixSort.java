/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento genérico mediante RadiSort.
 * 
 * @author Jonathan G Araya
 *
 */
public class GenericRadixSort<T extends Comparable<T>> {

	public GenericRadixSort() {
	}

	public void radixSort(T[] array) {
	}

	public void printL(String[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + ", ");
		}
		System.out.print(arreglo[arreglo.length - 1]);
		System.out.print("]");
		System.out.println(" ");
	}
}
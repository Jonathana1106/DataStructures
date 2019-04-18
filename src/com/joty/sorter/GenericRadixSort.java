package com.joty.sorter;

/**
 * 
 * @author Jonathan
 *
 */
public class GenericRadixSort<T extends Comparable<T>> {

	private T i;
	private T j;
	private T x;

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
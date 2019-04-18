/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de implementar los métodos de BubbleSort.
 * 
 * @author Jonathan G Araya
 *
 */
public class BubbleSort {

	// Variables de la clase.
	private int i;
	private int j;
	private int temp;

	/**
	 * Método que inicializa las variables.
	 */
	public BubbleSort() {
		this.i = 0;
		this.j = 0;
		this.temp = 0;
	}

	/**
	 * Método que se encarga de recibir un array de enteros a ordenar.
	 * 
	 * @param array sobre el que va a realizar bubblesort.
	 */
	public void bubbleSort(int[] array) {
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * Método que se encarga de imprimir un arreglo.
	 * 
	 * @param arreglo que va a imprimir en consola.
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
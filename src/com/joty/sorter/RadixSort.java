/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan G Araya
 *
 */
public class RadixSort {

	/**
	 * Variables de la clase.
	 */
	private int i;
	private int j;
	private int x;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public RadixSort() {
		this.i = 0;
		this.j = 0;
		this.x = 0;
	}

	/**
	 * Método que realizar el ordenamiento de un arreglo por el algoritmo RadixSort.
	 * 
	 * @param array a ordenar.
	 */
	public void radixSort(int[] array) {
		for (x = 32; x >= 0; x--) {
			int[] aux = new int[array.length];
			j = 0;
			for (int i = 0; i < array.length; i++) {
				boolean move = array[i] << x >= 0;
				if (x == 0 ? !move : move) {
					aux[j] = array[i];
					j++;
				} else {
					array[i - j] = array[i];
				}
			}
			for (i = j; i < aux.length; i++) {
				aux[i] = array[i - j];
			}
			array = aux;
		}
		System.out.println("Arreglo Ordenado");
		printL(array);
	}

	/**
	 * Método que se encarga de imprimir en consola un arreglo.
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
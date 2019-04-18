/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante ShellSort.
 * 
 * @author Jonathan G Araya
 *
 */
public class ShellSort {

	/**
	 * Variables de la clase.
	 */
	private int i;
	private int j;
	private int k;
	private int skip;
	private int aux;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public ShellSort() {
	}

	/**
	 * Método que se encarga de realizar el ordenamiento por ShellSort.
	 * 
	 * @param array a ordenar.
	 */
	public void shellSort(int[] array) {
		skip = (int) (array.length / 2);
		while (skip > 0) {
			for (i = skip; i < array.length; i++) {
				j = (i - skip);
				while (j >= 0) {
					k = (j + skip);
					if (array[j] <= array[k]) {
						j = -1;
					} else {
						aux = array[j];
						array[j] = array[k];
						array[k] = aux;
						j -= skip;
					}
				}
			}
			skip = (int) skip / 2;
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
/**
 * 
 */
package com.joty.sorter;

/**
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
	 * @param arreglo a ordenar.
	 */
	public void shellSort(int[] arreglo) {
		skip = (int) (arreglo.length / 2);
		while (skip > 0) {
			for (i = skip; i < arreglo.length; i++) {
				j = (i - skip);
				while (j >= 0) {
					k = (j + skip);
					if (arreglo[j] <= arreglo[k]) {
						j = -1;
					} else {
						aux = arreglo[j];
						arreglo[j] = arreglo[k];
						arreglo[k] = aux;
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
/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de imprimir un array en consola.
 * 
 * @author Jonathan
 *
 */
public class PrintArray {

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public PrintArray() {
	}

	/**
	 * Método que se encarga de imprimir un arreglo en consola.
	 * 
	 * @param arreglo
	 */
	public void printArray(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + ", ");
		}
		System.out.print(arreglo[arreglo.length - 1]);
		System.out.print("]");
		System.out.println(" ");
	}
}
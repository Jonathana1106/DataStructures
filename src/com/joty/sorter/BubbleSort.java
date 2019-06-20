/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de implementar los m�todos de BubbleSort. Funciona
 * revisando cada elemento de la lista que va a ser ordenada con el siguiente,
 * intercambi�ndolos de posici�n si est�n en el orden equivocado. Es necesario
 * revisar varias veces toda la lista hasta que no se necesiten m�s
 * intercambios, lo cual significa que la lista est� ordenada.
 * 
 * @author Jonathan G Araya
 *
 */
public class BubbleSort {

	/**
	 * Variables de la clase.
	 */
	private int i;
	private int j;
	private int temp;

	/**
	 * M�todo que inicializa las variables.
	 */
	public BubbleSort() {
		this.i = 0;
		this.j = 0;
		this.temp = 0;
	}

	/**
	 * M�todo que se encarga de recibir un array de enteros a ordenar.
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
}
/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante ShellSort. El Shell
 * sort es una generalizaci�n del ordenamiento por inserci�n, teniendo en cuenta
 * dos observaciones:
 * 
 * El ordenamiento por inserci�n es eficiente si la entrada est� "casi
 * ordenada".
 * 
 * El ordenamiento por inserci�n es ineficiente, en general, porque mueve los
 * valores s�lo una posici�n cada vez.
 * 
 * El algoritmo Shell sort mejora el ordenamiento por inserci�n comparando
 * elementos separados por un espacio de varias posiciones. Esto permite que un
 * elemento haga "pasos m�s grandes" hacia su posici�n esperada. Los pasos
 * m�ltiples sobre los datos se hacen con tama�os de espacio cada vez m�s
 * peque�os. El �ltimo paso del Shell sort es un simple ordenamiento por
 * inserci�n, pero para entonces, ya est� garantizado que los datos del vector
 * est�n casi ordenados.
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
	 * M�todo que se encarga de inicializar la clase.
	 */
	public ShellSort() {
	}

	/**
	 * M�todo que se encarga de realizar el ordenamiento por ShellSort.
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
}
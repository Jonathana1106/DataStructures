/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de realizar un ordenamiento mediante ShellSort. El Shell
 * sort es una generalización del ordenamiento por inserción, teniendo en cuenta
 * dos observaciones:
 * 
 * El ordenamiento por inserción es eficiente si la entrada está "casi
 * ordenada".
 * 
 * El ordenamiento por inserción es ineficiente, en general, porque mueve los
 * valores sólo una posición cada vez.
 * 
 * El algoritmo Shell sort mejora el ordenamiento por inserción comparando
 * elementos separados por un espacio de varias posiciones. Esto permite que un
 * elemento haga "pasos más grandes" hacia su posición esperada. Los pasos
 * múltiples sobre los datos se hacen con tamaños de espacio cada vez más
 * pequeños. El último paso del Shell sort es un simple ordenamiento por
 * inserción, pero para entonces, ya está garantizado que los datos del vector
 * están casi ordenados.
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
}
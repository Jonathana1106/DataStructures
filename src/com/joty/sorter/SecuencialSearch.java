/**
 * 
 */
package com.joty.sorter;

/**
 * Clase que se encarga de implementar la b�squeda secuencial.
 * 
 * @author Jonathan
 *
 */
public class SecuencialSearch {

    /**
     * M�todo que se encarga de realizar una busqueda secuencial en un array de un
     * n�mero.
     * 
     * @param array
     * @param num
     * @return
     */
    public int secuencialSearch(int array[], int num) {
	int i = 0;

	while (i < array.length) {
	    if (array[i] == num) {
		System.out.println("The searched element it's in the index: " + i);
		return num;
	    } else {
		i++;
	    }
	}
	return -1;
    }
}
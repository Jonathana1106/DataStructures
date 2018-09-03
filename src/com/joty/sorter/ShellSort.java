/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan
 *
 */
public class ShellSort {

    private int i;
    private int j;
    private int k;
    private int skip;
    private int aux;

    public ShellSort() {
    }

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
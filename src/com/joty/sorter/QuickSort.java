/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan
 *
 */
public class QuickSort {

    private int i;
    private int j;
    private String pivot;
    private String aux;

    public QuickSort() {
    }

    public void quickSort(String array[]) {
	quickSort(array, 0, array.length - 1);
    }

    private void quickSort(String array[], int first, int last) {
	i = first;
	j = last;
	pivot = array[(first + last) / 2];

	do {
	    while (array[i].compareTo(pivot) < 0) {
		i++;
	    }
	    while (array[j].compareTo(pivot) > 0) {
		j--;
	    }
	    if (i <= j) {
		aux = array[i];
		array[i] = array[j];
		array[j] = aux;
		i++;
		j--;
	    }
	} while (i <= j);
	if (first < j) {
	    quickSort(array, first, j);
	}
	if (i < last) {
	    quickSort(array, i, last);
	}
    }

    public void printL(String[] arreglo) {
	System.out.print("[");
	for (int i = 0; i < arreglo.length - 1; i++) {
	    System.out.print(arreglo[i] + ", ");
	}
	System.out.print(arreglo[arreglo.length - 1]);
	System.out.print("]");
	System.out.println(" ");
    }
}
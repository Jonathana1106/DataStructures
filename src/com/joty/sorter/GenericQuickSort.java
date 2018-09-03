/**
 * 
 */
package com.joty.sorter;

import com.joty.listas.SimpleLL;

/**
 * @author Jonathan
 *
 */
public class GenericQuickSort<T extends Comparable<T>> {

    private int i;
    private int j;
    private T pivot;
    private T temp;

    public GenericQuickSort() {
    }

    public void quickSort(SimpleLL<T> arreglo) {
	quickSort(arreglo, 0, arreglo.getSize() - 1);
    }

    private void quickSort(SimpleLL<T> arreglo, int first, int last) {
	i = first;
	j = last;
	pivot = arreglo.getDatai((int) ((i + j) / 2));

	do {
	    while (arreglo.getData(i).compareTo(pivot) < 0) {
		i++;
	    }
	    while (arreglo.getData(j).compareTo(pivot) > 0) {
		j--;
	    }
	    if (i <= j) {
		/**************************************************************/
		temp = arreglo.getData(i);
		arreglo.setDatai(i, arreglo.getData(j));
		arreglo.setDatai(j, temp);
		i++;
		j--;
		/***************************************************************/
	    }
	} while (i <= j);
	/***********************/
	if (first < j) {
	    quickSort(arreglo, first, j);
	}
	if (i < last) {
	    quickSort(arreglo, i, last);
	}
	/**************************/
    }

    public void printL(SimpleLL<T> arreglo) {
	System.out.print("[");
	for (int i = 0; i < arreglo.getSize() - 1; i++) {
	    System.out.print(arreglo.getData(i) + ", ");
	}
	System.out.print(arreglo.getData(arreglo.getSize() - 1));
	System.out.print("]");
	System.out.println(" ");
    }
}
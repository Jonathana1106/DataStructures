/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan
 *
 */
public class BubbleSort {

    private int i;
    private int j;
    private int temp;

    public BubbleSort() {
	this.i = 0;
	this.j = 0;
	this.temp = 0;
    }

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
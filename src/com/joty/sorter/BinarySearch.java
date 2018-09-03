/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan
 *
 */
public class BinarySearch {

    private int center;
    private int first;
    private int last;
    private int centerValue;

    public BinarySearch() {
    }

    public int binarySeach(int arreglo[], int data) {
	first = 0;
	last = (arreglo.length);

	while (first < last) {
	    center = (int) ((first + last) / 2);
	    centerValue = arreglo[center];
	    if (data == centerValue) {
		System.out.println("The searched element it's in the index: " + center);
		return center;
	    } else if (data < centerValue) {
		last = center - 1;
	    } else {
		first = center + 1;
	    }
	}
	return -1;
    }
}

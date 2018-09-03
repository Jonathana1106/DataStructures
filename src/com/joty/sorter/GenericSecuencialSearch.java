/**
 * 
 */
package com.joty.sorter;

/**
 * @author Jonathan
 * @param <T>
 *
 */
public class GenericSecuencialSearch<T extends Comparable<T>> {

    public GenericSecuencialSearch() {
    }

    public T genericSecuencialSearch(T array[], T data) {
	int i = 0;

	while (i < array.length) {

	    if (array[i] == data) {
		System.out.println("The searched element it's in the index: " + i);
		return data;
	    } else {
		i++;
	    }
	}
	System.out.println("The searched element was not found.");
	return data;
    }
}
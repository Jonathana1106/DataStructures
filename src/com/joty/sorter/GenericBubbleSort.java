/**
 * 
 */
package com.joty.sorter;

import com.joty.listas.Node;
import com.joty.listas.SimpleLL;

/**
 * @author Jonathan
 *
 */
public class GenericBubbleSort<T extends Comparable<T>> {

    private T temp;

    public GenericBubbleSort() {
    }

    public void bubbleSort(SimpleLL<T> list) {
	for (int i = 0; i < list.getSize() - 1; i++) {
	    Node<T> aux = list.getHead();
	    Node<T> next = list.getHead().getNext();
	    for (int j = 1; j < list.getSize() - 1; j++) {
		if (aux.getData().compareTo(next.getData()) > 0) {
		    temp = aux.getData();
		    aux.setData(next.getData());
		    next.setData(temp);
		}
		aux = next;
		next = next.getNext();
	    }
	}
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
/**
 * 
 */
package com.joty.sorter;

import com.joty.listas.Node;
import com.joty.listas.SimpleLL;

/**
 * @author Jonathan G Araya
 *
 */
public class GenericBubbleSort<T extends Comparable<T>> {

	/**
	 * Variable de la clase.
	 */
	private T temp;

	/**
	 * Método que se encarga de inicializar la clase.
	 */
	public GenericBubbleSort() {
	}

	/**
	 * Método que se encarga de realizar el ordenamiento por BubbleSort.
	 * 
	 * @param list sonbre la que ejecutará el ordenamiento.
	 */
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

	/**
	 * Método que se encarga de imprimir el arreglo.
	 * 
	 * @param arreglo
	 */
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
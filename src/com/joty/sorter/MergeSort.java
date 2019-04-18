/**
 * 
 */
package com.joty.sorter;

import com.joty.listas.SimpleLL;

/**
 * Clase que se encarga de realizar un ordenamiento mediante MergeSort.
 * 
 * @author Jonathan G Araya
 *
 */
public class MergeSort {

	/**
	 * 
	 */
	public MergeSort() {
	}

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private SimpleLL mergeSort(SimpleLL array) {

		SimpleLL left = new SimpleLL();
		SimpleLL right = new SimpleLL();
		SimpleLL result = new SimpleLL();

		if (array.getSize() < 1) {
			return array;
		} else {
			int p = array.getSize() / 2;

			for (int i = 0; i < p; i++) {
				left.add(array.getDataIndex(i));
			}
			for (int j = p + 1; j < array.getSize(); j++) {
				right.add(array.getDataIndex(j));
			}

			mergeSort(left);
			mergeSort(right);

			if ((int) left.getData(p - 1) <= (int) right.getData(p + 1)) {
				for (int i = 0; i < right.getSize(); i++) {
					left.add(right.getData(i));
				}
				return left;
			}
			result = merge(left, right);
			return result;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private SimpleLL merge(SimpleLL left, SimpleLL right) {
		SimpleLL result = new SimpleLL();

		while (left.getSize() > 0 && right.getSize() > 0) {
			if ((int) left.getData(0) <= (int) right.getData(0)) {
				result.add(left.getData(0));
				left.deleteValue(0);
			} else {
				result.add(right.getData(0));
				right.deleteValue(0);
			}
		}
		if (left.getSize() > 0) {
			for (int i = 0; i < left.getSize(); i++) {
				result.add(left.getDataIndex(i));
			}
		}
		if (right.getSize() > 0) {
			for (int i = 0; i < right.getSize(); i++) {
				result.add(right.getDataIndex(i));
			}
		}
		return result;
	}

	/**
	 * Método que se encarga de imprimir un arreglo en consola.
	 * 
	 * @param arreglo
	 */
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
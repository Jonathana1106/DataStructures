/**
 * 
 */
package com.joty.colas;

/**
 * Clase en la que se crean los métotos que tendrá ColaNode.
 * 
 * @author Jonathan G Araya
 * @param <T>
 *
 */
public class ColaNode<T> {

	/**
	 * Variables de la clase.
	 */
	private ColaNode<T> next;
	private T data;

	/**
	 * Método para inicializar una cola.
	 */
	public ColaNode() {
		this.next = null;
	}

	/**
	 * Método que obtiene el siguiente nodo de la cola.
	 * 
	 * @return
	 */
	public ColaNode<T> getNext() {
		return next;
	}

	/**
	 * Método que establece el siguiente nodo en una cola.
	 * 
	 * @param next
	 */
	public void setNext(ColaNode<T> next) {
		this.next = next;
	}

	/**
	 * Método que obtiene el dato de un nodo.
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * Método que establece el dato de un nodo.
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}
}
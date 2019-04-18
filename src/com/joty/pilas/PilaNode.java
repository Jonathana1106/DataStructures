/**
 * 
 */
package com.joty.pilas;

/**
 * Clase que se encarga de estableces los métodos para PilaNode.
 * 
 * @author Jonathan
 * @param <T>
 *
 */
public class PilaNode<T> {

	/**
	 * Variables de la clase.
	 */
	private PilaNode<T> next;
	private T data;

	/**
	 * Método que se encarga de inializar la clase.
	 */
	public PilaNode() {
		this.next = null;
	}

	/**
	 * Método que se encarga de obtener el siguiente nodo de una pila.
	 * 
	 * @return
	 */
	public PilaNode<T> getNext() {
		return next;
	}

	/**
	 * Método que se encarga de establecer el siguiente nodo de una pila.
	 * 
	 * @param next
	 */
	public void setNext(PilaNode<T> next) {
		this.next = next;
	}

	/**
	 * Método que se encarga de obtener un dato del nodo de la pila.
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * Método que se encarga de establecer el dato de un nodo de la pila.
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}
}
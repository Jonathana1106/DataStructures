/**
 * 
 */
package com.joty.colas;

/**
 * Clase en la que se crean los m�totos que tendr� ColaNode.
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
	 * M�todo para inicializar una cola.
	 */
	public ColaNode() {
		this.next = null;
	}

	/**
	 * M�todo que obtiene el siguiente nodo de la cola.
	 * 
	 * @return
	 */
	public ColaNode<T> getNext() {
		return next;
	}

	/**
	 * M�todo que establece el siguiente nodo en una cola.
	 * 
	 * @param next
	 */
	public void setNext(ColaNode<T> next) {
		this.next = next;
	}

	/**
	 * M�todo que obtiene el dato de un nodo.
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * M�todo que establece el dato de un nodo.
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}
}
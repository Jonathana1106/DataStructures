/**
 * 
 */
package com.joty.pilas;

/**
 * Clase que se encarga de establecer los m�todos que tendr� la Pila.
 * 
 * @author Jonathan G Araya
 * @param <T>
 *
 */
public class Pila<T> {

	/**
	 * Variables de la clase.
	 */
	private PilaNode<T> top;
	private int size;

	/**
	 * M�todo que inicializa una pila.
	 */
	public Pila() {
		this.top = null;
		this.size = 0;
	}

	/**
	 * M�todo que se encarga de agregar datos a la pila.
	 * 
	 * @param data
	 */
	public void push(T data) {
		PilaNode<T> node = new PilaNode<>();
		node.setData(data);
		node.setNext(top);
		top = node;
		size += 1;
	}

	/**
	 * M�todo que se encarga de sacar datos de la pila.
	 * 
	 * @return
	 */
	public T pop() {
		T aux = (T) top.getData();
		top = top.getNext();
		size -= 1;
		System.out.println(aux);
		return aux;
	}

	/**
	 * M�todo que se encarga de obtener datos de la pila.
	 * 
	 * @return
	 */
	public T peek() {
		System.out.println(top.getData());
		return (T) top.getData();
	}

	/**
	 * M�todo que se encarga de conocer el tama�o de la pila.
	 * 
	 * @return
	 */
	protected int pilaLarge() {
		System.out.println(size);
		return size;
	}

	/**
	 * M�todo que se encarga de limpiar la pila.
	 */
	public void clearPila() {
		while (top != null) {
			pop();
		}
	}
}
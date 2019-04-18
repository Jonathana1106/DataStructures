/**
* 
*/
package com.joty.colas;

/**
 * Clase en la que se crean los m�todos que tendr� la clase.
 * 
 * @author Jonathan G Araya
 * @param <T>
 *
 */
public class Cola<T> {

	/**
	 * Variables de la clase.
	 */
	private ColaNode<T> top;
	private ColaNode<T> buttom;
	private int size;

	/**
	 * M�todo en el cual se inicializan el top, bottom y el tama�o de la cola.
	 */
	public Cola() {
		this.top = null;
		this.buttom = null;
		this.size = 0;
	}

	/**
	 * M�todo que se encarga de agregar datos a la cola.
	 * 
	 * @param data: dato que va a agregar a la cola.
	 */
	public void enqueue(T data) {
		ColaNode<T> node = new ColaNode<>();
		node.setData(data);
		if (isEmpty()) {
			buttom = node;
		} else {
			top.setNext(node);
		}
		top = node;
		size += 1;
	}

	/**
	 * M�todo que se encarga de obtener y eliminar datos de la cola.
	 * 
	 * @return el dato de la cola y lo elimina de la misma.
	 */
	public T dequeue() {
		T aux = (T) buttom.getData();
		buttom = buttom.getNext();
		size -= 1;
		System.out.println(aux);
		return aux;
	}

	/**
	 * M�todo que se encarga de obtener datos de la cola.
	 * 
	 * @return el dato de la cola sin eliminarlo de la misma.
	 */
	public T peek() {
		System.out.println(buttom.getData());
		return (T) buttom.getData();
	}

	/**
	 * M�todo que se encarga de medir el tama�o de la cola.
	 * 
	 * @return el tama�o de la cola.
	 */
	protected int colaLarge() {
		System.out.println(size);
		return size;
	}

	/**
	 * M�todo que se encarga de conocer si la cola se encuentra vac�a o no.
	 * 
	 * @return Falso o verdadero.
	 */
	private boolean isEmpty() {
		return buttom == null;
	}

	/**
	 * M�todo que se encarga de limpiar la cola.
	 */
	public void colaClear() {
		while (!isEmpty()) {
			dequeue();
		}
	}
}
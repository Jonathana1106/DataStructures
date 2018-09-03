/**
* 
*/
package com.joty.colas;

/**
 * 
 * @author Jonathan
 * @param <T>
 *
 */
public class Cola<T> {

    private ColaNode<T> top;
    private ColaNode<T> buttom;
    private int size;

    /**
     * 
     */
    public Cola() {
	this.top = null;
	this.buttom = null;
	this.size = 0;
    }

    /**
     * 
     * @param data
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
     * 
     * @return
     */
    public T dequeue() {
	T aux = (T) buttom.getData();
	buttom = buttom.getNext();
	size -= 1;
	System.out.println(aux);
	return aux;
    }

    /**
     * 
     * @return
     */
    public T peek() {
	System.out.println(buttom.getData());
	return (T) buttom.getData();
    }

    /**
     * 
     * @return
     */
    public int colaLarge() {
	System.out.println(size);
	return size;
    }

    public boolean isEmpty() {
	return buttom == null;
    }

    public void colaClear() {
	while (!isEmpty()) {
	    dequeue();
	}
    }
}
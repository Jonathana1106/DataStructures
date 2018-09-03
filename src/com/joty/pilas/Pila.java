/**
 * 
 */
package com.joty.pilas;

/**
 * @author Jonathan
 * @param <T>
 *
 */
public class Pila<T> {

    private PilaNode<T> top;
    private int size;

    /**
     * 
     */
    public Pila() {
	this.top = null;
	this.size = 0;
    }

    /**
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
     * 
     * @return
     */
    public T peek() {
	System.out.println(top.getData());
	return (T) top.getData();
    }

    /**
     * 
     * @return
     */
    public int pilaLarge() {
	System.out.println(size);
	return size;
    }

    /**
     * 
     */
    public void clearPila() {
	while (top != null) {
	    pop();
	}
    }
}
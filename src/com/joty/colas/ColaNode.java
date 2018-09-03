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
public class ColaNode<T> {

    private ColaNode<T> next;
    private T data;

    /**
     * 
     */
    public ColaNode() {
	this.next = null;
    }

    public ColaNode<T> getNext() {
	return next;
    }

    public void setNext(ColaNode<T> next) {
	this.next = next;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }
}
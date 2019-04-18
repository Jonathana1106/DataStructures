/**
 * 
 */
package com.joty.listas;

/**
 * 
 * @author Jonathan
 *
 * @param <T>
 */
public class Node<T> {

	/**
	 * 
	 */
	private Node<T> next;
	private Node<T> previous;
	private T data;
	private SimpleLL<T> value;
	private Node<T> list;

	/**
	 * 
	 * @param data
	 */
	public Node(T data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	/**
	 * 
	 * @return
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * 
	 * @param next
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

	/**
	 * 
	 * @return
	 */
	public Node<T> getPrevious() {
		return previous;
	}

	/**
	 * 
	 * @param previous
	 */
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	/**
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 
	 * @return
	 */
	public SimpleLL<T> getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(SimpleLL<T> value) {
		this.value = value;
	}

	/**
	 * 
	 * @return
	 */
	public Node<T> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 */
	public void setList(Node<T> list) {
		this.list = list;
	}
}

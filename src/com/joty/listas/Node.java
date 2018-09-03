package com.joty.listas;

public class Node<T> {

    private Node<T> next;
    private Node<T> previous;
    private T data;
    private SimpleLL<T> value;
    private Node<T> list;

    public Node(T data) {
	this.data = data;
	this.next = null;
	this.previous = null;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public Node<T> getPrevious() {
	return previous;
    }

    public void setPrevious(Node<T> previous) {
	this.previous = previous;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public SimpleLL<T> getValue() {
	return value;
    }

    public void setValue(SimpleLL<T> value) {
	this.value = value;
    }

    public Node<T> getList() {
	return list;
    }

    public void setList(Node<T> list) {
	this.list = list;
    }
}

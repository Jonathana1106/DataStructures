/**
 * 
 */
package com.joty.trees;

/**
 * @author Jonathan
 *
 */
public class GenericBSTNode<T extends Comparable<T>> {

    private T data;
    private GenericBSTNode<T> left;
    private GenericBSTNode<T> right;

    public GenericBSTNode(T data) {
	this.data = data;
	this.right = null;
	this.left = null;
    }

    public GenericBSTNode(T data, GenericBSTNode<T> left, GenericBSTNode<T> right) {
	this.data = data;
	this.left = left;
	this.right = right;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public GenericBSTNode<T> getRight() {
	return right;
    }

    public void setRight(GenericBSTNode<T> right) {
	this.right = right;
    }

    public GenericBSTNode<T> getLeft() {
	return left;
    }

    public void setLeft(GenericBSTNode<T> left) {
	this.left = left;
    }
}
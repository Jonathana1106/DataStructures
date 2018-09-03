/**
 * 
 */
package com.joty.trees;

/**
 * @author Jonathan
 *
 */
public class GenericSplayNode<T extends Comparable<T>> {

    private T data;
    private GenericSplayNode<T> left;
    private GenericSplayNode<T> right;
    private GenericSplayNode<T> parent;

    public GenericSplayNode() {
	this(null, null, null, null);
    }

    public GenericSplayNode(T ele) {
	this(ele, null, null, null);
    }

    public GenericSplayNode(T data, GenericSplayNode<T> left, GenericSplayNode<T> right, GenericSplayNode<T> parent) {
	this.left = left;
	this.right = right;
	this.parent = parent;
	this.data = data;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public GenericSplayNode<T> getLeft() {
	return left;
    }

    public void setLeft(GenericSplayNode<T> left) {
	this.left = left;
    }

    public GenericSplayNode<T> getRight() {
	return right;
    }

    public void setRight(GenericSplayNode<T> right) {
	this.right = right;
    }

    public GenericSplayNode<T> getParent() {
	return parent;
    }

    public void setParent(GenericSplayNode<T> parent) {
	this.parent = parent;
    }
}
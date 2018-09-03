package com.joty.trees;

/**
 * 
 * @author Jonathan
 *
 * @param <T>
 */
public class GenericAVLNode<T extends Comparable<T>> implements Comparable<GenericAVLNode<T>> {

    private T data;
    private GenericAVLNode<T> left;
    private GenericAVLNode<T> right;
    public int level;
    private int depth;

    public GenericAVLNode(T data) {
	this(data, null, null);
    }

    public GenericAVLNode(T data, GenericAVLNode<T> left, GenericAVLNode<T> right) {
	super();
	this.data = data;
	this.left = left;
	this.right = right;

	if (left == null && right == null) {
	    setDepth(1);
	} else if (left == null) {
	    setDepth(right.getDepth() + 1);
	} else if (right == null) {
	    setDepth(left.getDepth() + 1);
	} else {
	    setDepth(Math.max(left.getDepth(), right.getDepth()) + 1);
	}
    }

    @Override
    public int compareTo(GenericAVLNode<T> o) {
	return 0;
    }

    @Override
    public String toString() {
	return "Level " + level + ": " + data;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public GenericAVLNode<T> getLeft() {
	return left;
    }

    public void setLeft(GenericAVLNode<T> left) {
	this.left = left;
    }

    public GenericAVLNode<T> getRight() {
	return right;
    }

    public void setRight(GenericAVLNode<T> right) {
	this.right = right;
    }

    public int getDepth() {
	return depth;
    }

    public void setDepth(int depth) {
	this.depth = depth;
    }
}
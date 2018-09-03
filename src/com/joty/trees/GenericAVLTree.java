package com.joty.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Jonathan
 *
 * @param <T>
 */
public class GenericAVLTree<T extends Comparable<T>> {

    private GenericAVLNode<T> root;

    public GenericAVLTree() {
	root = null;
    }

    // private T Maximum() {
    // Node<T> local = root;
    // if (local == null)
    // return null;
    // while (local.getRight() != null)
    // local = local.getRight();
    // return local.getData();
    // }
    //
    // private T Minimum() {
    // Node<T> local = root;
    // if (local == null)
    // return null;
    // while (local.getLeft() != null) {
    // local = local.getLeft();
    // }
    // return local.getData();
    // }

    private int depth(GenericAVLNode<T> node) {
	if (node == null)
	    return 0;
	return node.getDepth();
	// 1 + Math.max(depth(node.getLeft()), depth(node.getRight()));
    }

    public GenericAVLNode<T> insert(T data) {
	root = insert(root, data);
	switch (balanceNumber(root)) {
	case 1:
	    root = rotateLeft(root);
	    break;
	case -1:
	    root = rotateRight(root);
	    break;
	default:
	    break;
	}
	return root;
    }

    private GenericAVLNode<T> insert(GenericAVLNode<T> node, T data) {
	if (node == null)
	    return new GenericAVLNode<T>(data);
	if (node.getData().compareTo(data) > 0) {
	    node = new GenericAVLNode<T>(node.getData(), insert(node.getLeft(), data), node.getRight());
	    // node.setLeft(insert(node.getLeft(), data));
	} else if (node.getData().compareTo(data) < 0) {
	    // node.setRight(insert(node.getRight(), data));
	    node = new GenericAVLNode<T>(node.getData(), node.getLeft(), insert(node.getRight(), data));
	}
	switch (balanceNumber(node)) {
	case 1:
	    node = rotateLeft(node);
	    break;
	case -1:
	    node = rotateRight(node);
	    break;
	default:
	    return node;
	}
	return node;
    }

    public GenericAVLNode<T> findMin() {
	return findMin(this.root);
    }

    private GenericAVLNode<T> findMin(GenericAVLNode<T> current) {
	if (current == null) {
	    return null;
	} else if (current.getLeft() == null) {
	    return current;
	} else {
	    return findMin(current.getLeft());
	}
    }

    public GenericAVLNode<T> findmax() {
	return findMax(this.root);
    }

    private GenericAVLNode<T> findMax(GenericAVLNode<T> current) {
	if (current == null) {
	    return null;
	} else if (current.getRight() == null) {
	    return current;
	} else {
	    return findMax(current.getRight());
	}
    }

    public GenericAVLNode<T> delete(T data) {
	if (this.root == null) {
	    return null;
	} else {
	    return delete(data, this.root);
	}
    }

    private GenericAVLNode<T> delete(T data, GenericAVLNode<T> current) {
	if (current == null) {
	    return current;
	}
	if (current.getData().compareTo(data) > 0) {
	    current.setLeft(delete(data, current.getLeft()));
	} else if (current.getData().compareTo(data) < 0) {
	    current.setRight(delete(data, current.getRight()));
	} else if (current.getLeft() != null && current.getRight() != null) {
	    current.setData(findMin(current.getRight()).getData());
	    data = findMin(current.getRight()).getData();
	    current.setRight(delete(data, current.getRight()));
	} else {
	    current = current.getRight() != null ? current.getRight() : current.getLeft();
	}
	return current;
    }

    private int balanceNumber(GenericAVLNode<T> node) {
	int L = depth(node.getLeft());
	int R = depth(node.getRight());
	if (L - R >= 2)
	    return -1;
	else if (L - R <= -2)
	    return 1;
	return 0;
    }

    private GenericAVLNode<T> rotateLeft(GenericAVLNode<T> node) {
	GenericAVLNode<T> q = node;
	GenericAVLNode<T> p = q.getRight();
	GenericAVLNode<T> c = q.getLeft();
	GenericAVLNode<T> a = p.getLeft();
	GenericAVLNode<T> b = p.getRight();
	q = new GenericAVLNode<T>(q.getData(), c, a);
	p = new GenericAVLNode<T>(p.getData(), q, b);
	return p;
    }

    private GenericAVLNode<T> rotateRight(GenericAVLNode<T> node) {
	GenericAVLNode<T> q = node;
	GenericAVLNode<T> p = q.getLeft();
	GenericAVLNode<T> c = q.getRight();
	GenericAVLNode<T> a = p.getLeft();
	GenericAVLNode<T> b = p.getRight();
	q = new GenericAVLNode<T>(q.getData(), b, c);
	p = new GenericAVLNode<T>(p.getData(), a, q);
	return p;
    }

    public boolean search(T data) {
	GenericAVLNode<T> local = root;
	while (local != null) {
	    if (local.getData().compareTo(data) == 0)
		return true;
	    else if (local.getData().compareTo(data) > 0)
		local = local.getLeft();
	    else
		local = local.getRight();
	}
	return false;
    }

    @Override
    public String toString() {
	return root.toString();
    }

    public void PrintTree() {
	root.level = 0;
	Queue<GenericAVLNode<T>> queue = new LinkedList<GenericAVLNode<T>>();
	queue.add(root);
	while (!queue.isEmpty()) {
	    GenericAVLNode<T> node = queue.poll();
	    System.out.println(node);
	    int level = node.level;
	    GenericAVLNode<T> left = node.getLeft();
	    GenericAVLNode<T> right = node.getRight();
	    if (left != null) {
		left.level = level + 1;
		queue.add(left);
	    }
	    if (right != null) {
		right.level = level + 1;
		queue.add(right);
	    }
	}
    }

    public void inOrder() {
	inOrder(root);
    }

    private void inOrder(GenericAVLNode<T> r) {
	if (r != null) {
	    inOrder(r.getLeft());
	    System.out.print(r.getData() + " ");
	    inOrder(r.getRight());
	}
    }

    public void preOrder() {
	preOrder(root);
    }

    private void preOrder(GenericAVLNode<T> r) {
	if (r != null) {
	    System.out.print(r.getData() + " ");
	    preOrder(r.getLeft());
	    preOrder(r.getRight());
	}
    }

    public void postOrder() {
	postOrder(root);
    }

    private void postOrder(GenericAVLNode<T> r) {
	if (r != null) {
	    postOrder(r.getLeft());
	    postOrder(r.getRight());
	    System.out.print(r.getData() + " ");
	}
    }
}

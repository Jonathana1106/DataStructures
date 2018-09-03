/**
 * 
 */
package com.joty.trees;

/**
 * @author Jonathan
 *
 */
public class GenericBSTTree<T extends Comparable<T>> {

    private GenericBSTNode<T> root;

    public GenericBSTTree() {
	this.root = null;
    }

    public GenericBSTNode<T> insert(T data) {

	root = insert(root, data);
	return root;
    }

    private GenericBSTNode<T> insert(GenericBSTNode<T> node, T data) {
	if (node == null)
	    return new GenericBSTNode<T>(data);
	if (node.getData().compareTo(data) > 0) {
	    node = new GenericBSTNode<T>(node.getData(), insert(node.getLeft(), data), node.getRight());
	} else if (node.getData().compareTo(data) < 0) {
	    node = new GenericBSTNode<T>(node.getData(), node.getLeft(), insert(node.getRight(), data));
	}
	return node;
    }

    public GenericBSTNode<T> findMin() {
	return findMin(this.root);
    }

    private GenericBSTNode<T> findMin(GenericBSTNode<T> current) {
	if (current == null) {
	    return null;
	} else if (current.getLeft() == null) {
	    return current;
	} else {
	    return findMin(current.getLeft());
	}
    }

    public GenericBSTNode<T> findmax() {
	return findMax(this.root);
    }

    private GenericBSTNode<T> findMax(GenericBSTNode<T> current) {
	if (current == null) {
	    return null;
	} else if (current.getRight() == null) {
	    return current;
	} else {
	    return findMax(current.getRight());
	}
    }

    public GenericBSTNode<T> delete(T data) {
	if (this.root == null) {
	    return null;
	} else {
	    return delete(data, this.root);
	}
    }

    private GenericBSTNode<T> delete(T data, GenericBSTNode<T> current) {
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

    public boolean search(T data) {
	GenericBSTNode<T> local = root;
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

    public void inOrder() {
	inOrder(root);
    }

    private void inOrder(GenericBSTNode<T> r) {
	if (r != null) {
	    inOrder(r.getLeft());
	    System.out.print(r.getData() + " ");
	    inOrder(r.getRight());
	}
    }

    public void preOrder() {
	preOrder(root);
    }

    private void preOrder(GenericBSTNode<T> r) {
	if (r != null) {
	    System.out.print(r.getData() + " ");
	    preOrder(r.getLeft());
	    preOrder(r.getRight());
	}
    }

    public void postOrder() {
	postOrder(root);
    }

    private void postOrder(GenericBSTNode<T> r) {
	if (r != null) {
	    postOrder(r.getLeft());
	    postOrder(r.getRight());
	    System.out.print(r.getData() + " ");
	}
    }
}
/**
 * 
 */
package com.joty.trees;

/**
 * @author Jonathan
 *
 */
public class GenericSplayTree<T extends Comparable<T>> {

    private GenericSplayNode<T> root;
    private int count = 0;

    public GenericSplayTree() {
	root = null;
    }

    public void insert(T ele) {
	GenericSplayNode<T> k = root;
	GenericSplayNode<T> l = null;
	while (k != null) {
	    l = k;
	    if (ele.compareTo(l.getData()) < 0) {
		k = k.getRight();
	    } else {
		k = k.getLeft();
	    }
	}

	k = new GenericSplayNode<>();
	k.setData(ele);
	k.setParent(l);

	if (l == null) {
	    root = k;
	} else if (ele.compareTo(l.getData()) < 0) {
	    l.setRight(k);
	} else {
	    l.setLeft(k);
	}

	Splay(k);
	count++;
    }

    public void makeLeftChildParent(GenericSplayNode<T> c, GenericSplayNode<T> p) {
	if ((c == null) || (p == null) || (p.getLeft() != c) || (c.getParent() != p)) {
	    throw new RuntimeException("WRONG");
	}
	if (p.getParent() != null) {
	    if (p == p.getParent().getLeft()) {
		p.getParent().setLeft(c);
	    } else {
		p.getParent().setRight(c);
	    }
	}
	if (c.getRight() != null) {
	    c.getRight().setParent(p);
	}

	c.setParent(p.getParent());
	p.setParent(c);
	p.setLeft(c.getRight());
	c.setRight(p);
    }

    public void makeRightChildParent(GenericSplayNode<T> c, GenericSplayNode<T> p) {
	if ((c == null) || (p == null) || (p.getRight() != c) || (c.getParent() != p)) {
	    throw new RuntimeException("WRONG");
	}
	if (p.getParent() != null) {
	    if (p == p.getParent().getLeft()) {
		p.getParent().setLeft(c);
	    } else {
		p.getParent().setRight(c);
	    }
	}
	if (c.getLeft() != null) {
	    c.getLeft().setParent(p);
	}

	c.setParent(p.getParent());
	p.setParent(c);
	p.setRight(c.getLeft());
	c.setLeft(p);
    }

    private void Splay(GenericSplayNode<T> x) {
	while (x.getParent() != null) {

	    GenericSplayNode<T> Parent = x.getParent();
	    GenericSplayNode<T> GrandParent = Parent.getParent();

	    if (GrandParent == null) {
		if (x == Parent.getLeft()) {
		    makeLeftChildParent(x, Parent);
		} else {
		    makeRightChildParent(x, Parent);
		}
	    } else {
		if (x == Parent.getLeft()) {
		    if (Parent == GrandParent.getLeft()) {
			makeLeftChildParent(Parent, GrandParent);
			makeLeftChildParent(x, Parent);
		    } else {
			makeLeftChildParent(x, x.getParent());
			makeRightChildParent(x, x.getParent());
		    }
		} else {
		    if (Parent == GrandParent.getLeft()) {
			makeRightChildParent(x, x.getParent());
			makeLeftChildParent(x, x.getParent());
		    } else {
			makeRightChildParent(Parent, GrandParent);
			makeRightChildParent(x, Parent);
		    }
		}
	    }
	}
	root = x;
    }

    public void remove(T val) {
	GenericSplayNode<T> node = findNode(val);
	remove(node);
    }

    private void remove(GenericSplayNode<T> node) {
	if (node == null) {
	    return;
	}

	Splay(node);

	if ((node.getLeft() != null) && (node.getRight() != null)) {
	    GenericSplayNode<T> y = node.getLeft();
	    while (y.getRight() != null) {
		y = y.getRight();
	    }

	    y.setRight(node.getRight());
	    node.getRight().setParent(y);
	    node.getLeft().setParent(null);
	    root = node.getLeft();

	} else if (node.getRight() != null) {
	    node.getRight().setParent(null);
	    root = node.getRight();
	} else if (node.getLeft() != null) {
	    node.getLeft().setParent(null);
	    root = node.getLeft();
	} else {
	    root = null;
	}

	node.setParent(null);
	node.setLeft(null);
	node.setRight(null);
	node = null;
	count--;
    }

    public int countNodes() {
	System.out.println("La cantidad de nodos es: " + count);
	return count;
    }

    public boolean search(T val) {
	return findNode(val) != null;
    }

    private GenericSplayNode<T> findNode(T val) {
	GenericSplayNode<T> j = root;
	while (j != null) {
	    if (val.compareTo(j.getData()) < 0) {
		j = j.getRight();
	    } else if (val.compareTo(j.getData()) > 0) {
		j = j.getLeft();
	    } else {
		return j;
	    }
	}
	return null;
    }

    public boolean isEmpty() {
	return root == null;
    }

    public void clear() {
	root = null;
    }

    public void inOrder() {
	inOrder(root);
    }

    private void inOrder(GenericSplayNode<T> r) {
	if (r != null) {
	    inOrder(r.getLeft());
	    System.out.print(r.getData() + " ");
	    inOrder(r.getRight());
	}
    }

    public void preOrder() {
	preOrder(root);
    }

    private void preOrder(GenericSplayNode<T> r) {
	if (r != null) {
	    System.out.print(r.getData() + " ");
	    preOrder(r.getLeft());
	    preOrder(r.getRight());
	}
    }

    public void postOrder() {
	postOrder(root);
    }

    private void postOrder(GenericSplayNode<T> r) {
	if (r != null) {
	    postOrder(r.getLeft());
	    postOrder(r.getRight());
	    System.out.print(r.getData() + " ");
	}
    }
}

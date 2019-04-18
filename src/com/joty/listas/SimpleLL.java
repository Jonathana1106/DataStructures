package com.joty.listas;

public class SimpleLL<T> {

	private Node<T> head;
	private int size;
	private int size2;
	private int count = 0;

	/**
	 * Constructor de la clase.
	 */
	public SimpleLL() {
		head = null;
		size = 0;
	}

	public SimpleLL(int size) {
		this.size = size;
		size2 = 0;
	}

	/**
	 * Método para agregar Nodo.
	 * 
	 * @param data
	 * @return
	 * 
	 */
	public boolean add(T data) {

		if (this.size != 0 && count == 0) {
			Node<T> node = new Node<T>(data);
			if (size2 == 0) {
				head = node;
				size2++;
			} else if (size2 < this.size) {
				Node<T> temp = head;
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(node);
				size2++;
			}
		} else {
			count++;
			Node<T> node = new Node<T>(data);
			if (size == 0) {
				head = node;
				size++;
			} else {
				Node<T> temp = head;
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(node);
				size++;
			}
		}
		return true;
	}

	/*************************************************************************************************/

	public T getDataIndex(int index) {
		Node<T> temp = this.getHead();
		while (index != 0) {
			temp = temp.getNext();
			index--;
		}
		System.out.println(temp.getData());
		return temp.getData();
	}

	public void setDataIndex(int index, T value) {
		Node<T> temp = this.getHead();
		while (index != 0) {
			temp = temp.getNext();
			index--;
		}
		temp.setData(value);
	}

	public void setDataNodeI(int index, SimpleLL<T> array) {
		Node<T> temp = this.getHead();
		while (index != 0) {
			temp = temp.getNext();
			index--;
		}
		temp.setValue(array);
	}

	public Node<T> getDataNodeI(int index) {
		Node<T> temp = this.getHead();
		while (index != 0) {
			temp = temp.getNext();
			index--;
		}
		return temp.getList();
	}

	/******************************************************************************************************/
	/**
	 * Metodo para mostrar el o los nodos.
	 * 
	 */
	public void show() {
		int i = 0;
		if (size == 0) {
			System.out.println("Empty");
		} else {
			Node<T> temp = head;
			while (temp.getNext() != null) {
				System.out.println("Node " + i + ": " + temp.getData());
				i++;
				temp = temp.getNext();
			}
			System.out.println("Node " + i + ": " + temp.getData());
		}
	}

	/**
	 * Metodo para eliminar.
	 * 
	 * @param erase
	 */
	public void delete(T erase) {
		if (head.getData() == erase) {
			head = head.getNext();
		} else {
			Node<T> current = this.head;
			while (current != null) {
				if (current.getNext().getData() == erase) {
					current.setNext(current.getNext().getNext());
					break;
				}
				current = current.getNext();
			}
		}
	}

	public T getData(int data) {
		Node<T> temp = this.getHead();
		int i = 0;
		while (i != data) {
			temp = temp.getNext();
			i++;
		}
		return temp.getData();
	}

	public boolean isEmpty() {
		return false;
	}

	/**
	 * Metodo para limpiar la lista.
	 */
	public void clear() {
		this.setHead(null);
		this.setSize(0);

	}

	/**
	 * Metodo para eliminar por valor.
	 * 
	 * @param i
	 */
	public void deleteValue(int i) {
		if (this.isEmpty()) {
			System.out.println("");
		} else {
			Node<T> temp = this.head;
			if (i == 0) {
				this.head = this.head.getNext();
				size--;
			} else if (i < size) {
				int j = 0;
				while ((i - 1) != j) {
					temp = temp.getNext();
					j++;
				}
				temp.setNext(temp.getNext().getNext());
				this.size--;
			} else {
				System.out.println("");
			}
		}
	}

	public void lenghtSimpleLL(int i) {
		SimpleLL<String> temp = new SimpleLL<>();
		for (int j = 0; j < i; j++) {
			temp.add("");
		}
	}

	/**
	 * Get y Set
	 * 
	 * @param head
	 */
	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		System.out.println(size);
		return size;
	}

	public Node<T> getHead() {
		return head;
	}
}

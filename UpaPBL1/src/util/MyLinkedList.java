package util;

public class MyLinkedList {

	Node head;
	Node tail;
	Node aux;

	int size = 0;

	Node getNode(int index) {
		if (index >= 0 && index < size) {
			Node n = head;

			for (int i = 0; i < index; i++) {
				n = n.getNext();

			}
			return n;
		}
		return null;

	}

	public void add(Object obj) {
		if (isEmpty()) {
			head.setData(obj);
			tail = head;
			size++;
		} else {
			tail.setNext(new Node(obj));
			tail = tail.getNext();
			size++;

		}
	}

	public boolean add(int pos, Object obj) {
		if (pos >= 0 && pos <= size()) {

			if (pos == 0) {
				Node newNode = new Node(obj);
				newNode.setNext(head);
				head = newNode;
				if (size == 1) {
					tail = newNode;
				}
				size++;
				return true;
			}

			Node previous = getNode(pos - 1);
			Node newNode = new Node(obj);

			if (previous == tail) {
				tail = newNode;
				previous.setNext(newNode);
				size++;
				tail = newNode;
				return true;
			}
			previous.setNext(newNode);
			newNode.setNext(previous.getNext());
			size++;
			return true;

		}
		return false;
	}

	public Object remove() {
		return remove(size() - 1);
	}

	public Object remove(int pos) {
		if (isEmpty()) {
			return null;
		} else {
			Node remove = getNode(pos);
			// Se a lista tiver apenas um elemento
			if (pos == 0 && size() == 1) {
				remove = head;
				head = null;
				tail = null;
				size--;
				return remove.getData();
			} else if (pos == 0) {
				remove = head;
				head = head.getNext();
				size--;
				return remove.getData();

			} else {
				Node previous = getNode(pos - 1);
				previous.setNext(remove.getNext());
				size--;

				return remove.getData();
			}
		}
	}

	public Object get(int index) {
		Node node = getNode(index);

		if (node == null) {
			return null;
		}
		return node.getData();
	}

	public boolean isEmpty() {

		return size() == 0;
	}

	public int size() {
		return size;
	}

}

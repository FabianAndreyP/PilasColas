//Util
package co.edu.unbosque.util;
public class DequeList<T> extends MyDobleLinkedList<T> implements Deque<T> {

	private DNode<T> tail;
	private int size;

	public DequeList() {
		head = new DNode<T>();
		tail = new DNode<T>();
		head.setNext(tail);
		tail.setPrev(head);
		size = 0;

	}

	@Override
	public void insertFirst(T info) {
		DNode<T> h = this.head;
		DNode<T> temporal = new DNode<T>();
		temporal.setInfo(info);
		temporal.setNext(h);
		h.setPrev(temporal);
		this.head = temporal;
		if (size == 0) {
			tail = temporal;
		}
		size++;

	}

	@Override
	public T removeFirst() {
		if (this.head == null) {
			return null;
		}
		T value = this.head.getInfo();
		head = head.getNext();
		size--;
		return value;
	}

	@Override
	public void insertLast(T info) {
		DNode<T> t = this.tail;
		DNode<T> temporal = new DNode<T>();
		temporal.setInfo(info);
		temporal.setPrev(t);
		t.setNext(temporal);
		this.tail = temporal;
		if (size == 0) {
			this.head = temporal;
		}
		size++;
	}

	@Override
	public T removeLast() {
		if (tail == null) {
			return null;
		}
		T value = tail.getInfo();
		tail = tail.getPrev();
		size--;
		return value;
	}

	@Override
	public int size() {
		return size;
	}

	public DNode<T> getTail() {
		return tail;
	}

	public void setTail(DNode<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("HEAD[");
		DNode<T> temporal = this.head;
		for (int i = 0; i < size; i++) {
			sb.append(temporal.getInfo());
			if (temporal==tail) {
				break;
			}
			sb.append("-");
			temporal= temporal.getNext();
		}
		sb.append("]TAIL");
		return sb.toString();
	}

}

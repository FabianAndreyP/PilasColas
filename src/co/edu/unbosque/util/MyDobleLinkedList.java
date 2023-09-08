package co.edu.unbosque.util;

public class MyDobleLinkedList<T> {

	// public llamar o usar desde otros paquetes
	// private solo se usa en esta clase no mas
	// visivilidad nula, solo con clase de el mismo paquete
	// Protected solo se usa en esta clase o en su heredado

	protected DNode<T> head;
	protected DNode<T> currentPosition;

	public MyDobleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<T> currentPosition) {
		this.currentPosition = currentPosition;
	}

	public void forWard(int... numPosition) {
		if (numPosition[0] > 0 && this.head != null) {
			int posForWard = numPosition[0];
			if (currentPosition == null) {
				currentPosition = this.head;
				posForWard--;
			}
			while (currentPosition.getNext() != null && posForWard > 0) {
				currentPosition = currentPosition.getNext();
				posForWard--;
			}
		}
	}

	public void insert(T data) {
		DNode<T> temp = new DNode<T>(data);
		if (currentPosition == null) {
			temp.setNext(this.head);
			if (this.head != null) {
				this.head.setPrev(temp);
			}
			this.head = temp;
		} else {
			temp.setNext(currentPosition.getNext());
			temp.setPrev(currentPosition);
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrev(temp);
			}
			currentPosition.setNext(temp);
		}
		currentPosition = temp;
	}

	public T extract() {
		T info = null;

		if (currentPosition != null) {
			info = currentPosition.getInfo();
			if (this.head == currentPosition) {
				this.head = currentPosition.getNext();
			} else {
				currentPosition.getPrev().setNext(currentPosition.getNext());
			}
			if (currentPosition.getNext() != null) {
				currentPosition.getNext().setPrev(currentPosition.getPrev());
			}
			currentPosition = currentPosition.getNext();
		}

		return info;
	}

	public void backWard(int numPosition) {
		if (numPosition <= 0 || this.head == null || currentPosition == null) {
			return;
		}
		int posBackWard = numPosition;
		while (currentPosition != null && posBackWard > 0) {
			currentPosition = currentPosition.getPrev();
			posBackWard--;
		}
	}

	@Override
	public String toString() {
		DNode<T> temp = this.head;
		StringBuilder sb = new StringBuilder();
		while (temp != null) {
			sb.append(temp.getInfo());
			if (temp.getNext() != null) {
				sb.append("<->");
			}
			temp = temp.getNext();
		}
		return sb.toString();
	}

}

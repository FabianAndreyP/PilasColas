//Pila
package co.edu.unbosque.util;
public class StackImpl<T> implements Stack<T> {
	private DequeList<T> data;

	public StackImpl() {
		data = new DequeList<T>();
	}

	@Override
	public void push(T info) {
		data.insertFirst(info);
	}
//Quita el ultimo que fue agregado 
	@Override
	public T pop() {
		return data.removeFirst();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public T peek() {
		T temporal =data.removeFirst();
		data.insertFirst(temporal);
		return temporal;
	}
	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("TOP[");
			DNode<T> temporal = data.getHead();
			for (int i = 0; i < data.getSize(); i++) {
				sb.append(temporal.getInfo());
				if (temporal==data.getTail()) {
					break;
				}
				sb.append("-\n");
				temporal= temporal.getNext();
			}
			sb.append("]BOTTOM");
			return sb.toString();
		
	}

}

//Cola
package co.edu.unbosque.util;
public class QueueImpl<T> implements Queue<T> {

	private DequeList<T> infos;

	public QueueImpl() {
		infos = new DequeList<T>();
	}

	@Override
	public void enqueue(T info) {
		infos.insertLast(info);
		//o al revez con la dequee
		//si o si tienenque entarr y salir por diferente lado
	}

	@Override
	public T deque() {
		return infos.removeFirst();
	}

	@Override
	public int size() {
		return infos.size();
	}

	@Override
	public T peek() {
		T temporal =infos.removeFirst();
		infos.insertFirst(temporal);
		return temporal;
	}

	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("BACK[");
			DNode<T> temporal = infos.getHead();
			for (int i = 0; i < infos.getSize(); i++) {
				sb.append(temporal.getInfo());
				if (temporal==infos.getTail()) {
					break;
				}
				sb.append("-");
				temporal= temporal.getNext();
			}
			sb.append("]FRONT");
			return sb.toString();
		
	}
	
}

//util
package co.edu.unbosque.util;

public interface Queue<T> {
	
	//meter al final
	public void enqueue(T info);
	//sacar desde el principio
	public T deque();
	//tamaño
	public int size();
	
	public T peek();

}

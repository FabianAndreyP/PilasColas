//Util
package co.edu.unbosque.util;

public interface Stack<T> {

	// colocar encima de todo osea de ultimas pero queda de principio
	public void push(T info);

	// Quitar de arriba y uselo
	public T pop();

	public int size();
	
	public T peek();

}

//Util
package co.edu.unbosque.util;
public interface Deque<T> {

public void insertLast(T info); 
public T removeLast();//traer ultimo dato, mostrar y eliminar
public void insertFirst(T info); 
public T removeFirst();//traer primer dato, mostrar y eliminar
public int size();
}

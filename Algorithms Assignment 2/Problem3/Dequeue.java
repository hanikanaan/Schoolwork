package Problem3;

/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Implementing a double ended queue (dequeue) using a doubly linked list as defined in DoublyLinkedList.java
 * 
 */

public class Dequeue<E> extends DoublyLinkedList<E> {

	private DoublyLinkedList<E> data;
	
	public Dequeue() {
		data = new DoublyLinkedList<E>();			//dequeue created as a new DLL object
	}
	
	public int size() {
		return data.size();							//returns number of elements in data, 0 if empty
	}
	
	public boolean isEmpty() {
		return data.isEmpty();						//returns true if size = 0
	}
	
	public E first() {
		return data.first();						//returns the first element in the queue
	}
	
	public E last() {
		return data.last();							//returns the last element in the queue
	}
	
	public void addFirst(E e) {
		data.addFirst(e);							//adds an element to the start of the stack
	}
	
	public void addLast(E e) {
		data.addLast(e);							//adds an element to the end of the queue
	}
	
	public E removeFirst() {
		return data.removeFirst();					//removes the first element of the queue (dequeues first)
	}
	
	public E removeLast() {
		return data.removeLast();					//removes last element of the queue (dequeues last)
	}
	
}

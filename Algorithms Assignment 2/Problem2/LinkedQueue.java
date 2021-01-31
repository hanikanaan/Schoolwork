package Problem2;
/**
 * 
 * @author Textbook
 * Taken from textbook, section 6.2.3, code segment 6.11, page 245
 * 
 */
public class LinkedQueue<E> extends SinglyLinkedList<E> {
 	SinglyLinkedList<E> list = new SinglyLinkedList<E>();
 	public LinkedQueue() {
 		
 	}
 	public int size() {
 		return list.size();
 	}
 	
 	public Boolean isEmpty() {
 		return list.isEmpty();
 	}
 	
 	public void enqueue(E e) {
 		list.addLast(e);
 	}
 	
 	public E first() {
 		return list.first();
 	}
 	
 	public E dequeue() {
 		return list.removeFirst();
 	}
}


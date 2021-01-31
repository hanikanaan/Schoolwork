package Problem2;
/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Stack implementation using queue, queue implemented by singly linked list
 * 
 */
public class Stack<E> {
	
	private LinkedQueue<E> data;
	
	public Stack() {
		data = new LinkedQueue<>();						//data = new linkedqueue object, data will be the stack
	}
	
	public int size() {
		return data.size();								//returns the number of elements in data, 0 if empty
	}
	
	public boolean isEmpty() {
		return data.isEmpty();							//returns true if size() == 0
	}
	
	public void push (E e) {
		data.enqueue(e);								//add object e on the queue
	}
	
	public E top () {
		LinkedQueue<E> temp = new LinkedQueue<>();		//temporary linked queue to preserve order and LIFO property
		if (isEmpty()) {
			return null;								//if the queue is empty, return null
		}
		for (int i = 0; i <= data.size(); i++) {		//copying data to the temporary "stack" (queue)
			temp.enqueue(data.dequeue());
		}
		for (int i = 0; i <= temp.size(); i++) {		//copying temp into data to preserve LIFO when getting top
			data.enqueue(temp.dequeue());				//Example: if data = {5, 4, 3, 2}, push(1) (enqueue (addLast)) -> {5, 4, 3, 2, 1}, temp = {1, 2, 3, 4, 5}, dequeue 1,
		}												// temp = {2, 3, 4, 5}, and data = {5, 4, 3, 2}
		return data.first();
	}
	
	public E pop () {
		LinkedQueue<E> temp = new LinkedQueue<>();		//Same as for top method, but we use dequeue to also remove the element
		if (isEmpty()) {
			return null;
		}
		for (int i = 0; i <= data.size(); i++) {
			temp.enqueue(data.dequeue());
		}
		for (int i = 0; i <= temp.size(); i++) {
			data.enqueue(temp.dequeue());
		}
		return data.dequeue();
	}
	
}
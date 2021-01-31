package Problem1;
/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Implementing queue using array stack (code for array stack taken from textbook)
 * 
 */
public class Queue<E>{

	private ArrayStack<E> data;
	
	public Queue() {
		data = new ArrayStack<E>();							//Create new ArrayStack object data
	}
	public int size() {
		return data.size();									//ArrayStack.size() -> returns size of array stack
	}

	public boolean isEmpty() {
		return data.isEmpty();								//ArrayStack.isEmpty() -> returns true if size = 0
	}

	public void enqueue(E e) {								//places element e in the first position in the queue
		ArrayStack<E> temp = new ArrayStack<E>();			//create a new temporary ArrayStack to preserve order
		for (int i = 0; i <= data.size(); i++) {
			temp.push(data.pop());							//temp = reversed order of data
		}
		temp.push(e);										//push object e into temporary ArrayStack
		for (int i = 0; i <= temp.size(); i++) {
			data.push(temp.pop());							//push object e
		}
	}

	public E first() {
		if (data.isEmpty()) {								//if the queue is empty, there is nothing to return so we return null
			return null;
		}
		return data.top();									//we return data.top(), which on a stack is the first element in the stack
	}

	public E dequeue() {
		if (data.isEmpty()) {								//if the queue is empty, there is nothing to return so we return null
			return null;
		}
		return data.pop();									//we return data.pop(), which returns the first element in the stack and removes it from the stack as well
	}
}
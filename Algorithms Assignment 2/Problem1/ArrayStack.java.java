package Problem1;
/**
 * 
 * @author Textbook
 * Taken from textbook, section 6.1.2 code fragment 6.2, page 230.
 * 
 */


public class ArrayStack<E> implements Stack<E> {
 	public static final int CAPACITY = 1000;
 	private E[] data;
 	private int t = -1;
 	public ArrayStack() { this(CAPACITY); }
 	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
 		data = (E[]) new Object[capacity];
 	}
 	public int size() {
 		return (t + 1);
 	}
 	public boolean isEmpty() {
 		return (t == -1);
 	}
 	public void push(E e) throws IllegalStateException {
 		if (size() == data.length) {
 			throw new IllegalStateException();
 		}
 		data[++t] = e;
 	}
 	
 	public E top() {
		if (isEmpty()){
 			return null;
 		}
 		return data[t];
 	}
 	
 	public E pop() {
 		if (isEmpty()){
 			return null;
 		} 
 		E ans = data[t];
 		data[t] = null;
 		t--;
 		return ans;
 	}
}

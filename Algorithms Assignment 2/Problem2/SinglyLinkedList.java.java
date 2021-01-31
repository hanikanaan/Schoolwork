package Problem2;

/**
 * 
 * @author Textbook
 * Taken from textbook, section 3.2.1 code fragment 3.14 & 3.15, page 126-127
 * 
 */

public class SinglyLinkedList<E> {
	private static class Node<E> {
		private E element;	//reference to element stored at node
		private Node<E> next;	//reference to following node in the list
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() { return element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> n) { next = n; }
	}
	private Node<E> head = null;
	private Node<E> tail = null; 
	private int size = 0;
	public SinglyLinkedList() { }	//empty constructor
	public int size() { return size; }
	public Boolean isEmpty () { return size == 0; }
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}

	public void addFirst (E e) {
		head = new Node<>(e, head);
		if (size == 0) {
			tail = head;
		}
		size++;
	}

	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if (isEmpty()) {
			head = newest;
		}
		else {
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0) {
			tail = null;
		}
		return answer;
	}
}
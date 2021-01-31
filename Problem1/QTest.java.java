package Problem1;
/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Testing the methods implemented in Queue.java
 * 
 */
public class QTest<E> extends Queue<E> {
	
	public static Queue<String> data = new Queue<>();	
	
	public static void main(String[] args) {				//expected outputs
		System.out.println(data.isEmpty());					//true
		data.enqueue("5");									//queue = {"5"}
		System.out.println(data.isEmpty());					//false
		data.enqueue("Hello");								//queue = {"5", "Hello"}
		System.out.println(data.size());					//size = 2, prints 2
		System.out.println(data.dequeue());					//prints 5, removes 5, queue = {"Hello"}
		System.out.println(data.first());					//prints Hello
		System.out.println(data.size());					//size = 1, prints 1
		data.dequeue();										//removes Hello, queue = {}
		System.out.println(data.isEmpty());					//true
	}
	
}

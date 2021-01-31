package Problem3;
/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Testing the methods implemented in Dequeue.java
 * 
 */
public class DQTest<E> extends Dequeue<E> {
	
	public static Dequeue<String> data = new Dequeue<String>();

	public static void main(String[] args) {				//expected outputs
		System.out.println(data.isEmpty());					//true
		data.addFirst("a");									//add a to start, dequeue = {a}
		System.out.println(data.isEmpty());					//false
		System.out.println(data.size());					//1
		data.addLast("b");									//add b to end, dequeue = {a, b}
		System.out.println(data.size());					//2
		System.out.println(data.first());					//print a
		System.out.println(data.removeLast());				//print b, remove b, dequeue = {a}
		System.out.println(data.size());					//1
		System.out.println(data.isEmpty());					//false
		data.addLast("c");									//add c to end, dequeue = {a, c}
		data.removeFirst();									//remove a, dequeue = {c}
		System.out.println(data.removeFirst());				//print c, remmove c, dequeue = {}
		System.out.println(data.isEmpty());					//true
		System.out.println(data.size());					//0
	}

}

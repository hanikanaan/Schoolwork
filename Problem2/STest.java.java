package Problem2;
/**
 * 
 * @author Hani Kanaan, student number 215573272
 * Testing the methods implemented in Stack.java
 * 
 */
public class STest<E> extends Stack<E> {

	public static Stack<Integer> data = new Stack<>();
	
	public static void main(String[] args) {	//expected outputs
		System.out.println(data.isEmpty());		//true
		data.push(5);							//stack = {5}
		System.out.println(data.isEmpty());		//false
		System.out.println(data.size());		//1
		System.out.println(data.top());			//5
		data.push(4);							//stack = {4, 5}
		System.out.println(data.size());		//2
		System.out.println(data.pop());			//4, remove 4, stack = {5}
		System.out.println(data.size());		//1
		data.pop();								//5, remove 5, stack = {}
		System.out.println(data.isEmpty());		//true
		System.out.println(data.size());		//0
	}
	
}

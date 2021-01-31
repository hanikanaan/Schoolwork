package Problem4;

/**
 * 
 * @author Hani Kanaan
 * Given an array of sorted integers, find two members of the array that sum to a given number k
 */
public class Problem4 {

	
	public static int index = 1;
	public static String findSum(int a, int[] arr) {
		int temp = 0;																												//initialize temp
		String resu = "No two integers exist that sum to this number in this array.";												//default string
		if (index == arr.length - 1) {																								//break condition
			return resu;
		}
		for (int i = index; i < arr.length; i++) {
			if (arr[index - 1] != 0) {																								//setting temporary to the first nonzero integer if possible
				temp = arr[index - 1];
			}
			if (temp + arr[i] == a) {																								//we check if the temp + arr[i] = a. If yes we set result string.
				resu =  "There exists two members of this array that sum to a at indeces a = " + (index - 1) + " and b = " + i;		
			}
		}
		for (int i = 0; i < index; i++) {																							//from the first element of the array to the arr[index] element
			arr[i] = 0;																												//set arr[i] to 0 for all values already read
		}
		index++;																													//increment index before recursive call
		findSum(a, arr);																											//recursive call
		return resu;																												//return
	}
	
	
//	*TESTING WITH MAIN*
	public static void main(String[] args) {
		int[] a = {-1, 0, 4, 9, 13, 14, 15, 18, 19, 22};
		System.out.println(findSum(21, a));
	}
	
}

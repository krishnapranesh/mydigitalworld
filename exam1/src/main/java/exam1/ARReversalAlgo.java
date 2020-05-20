package exam1;

import java.util.Arrays;

public class ARReversalAlgo {

	private static void  reverseArray(int[] intArr,int start,int end) {
	int temp;
		while(start <end) {
		temp = intArr[start];
		intArr[start] = intArr[end];
		intArr[end] = temp;
		start++;
		end--;
		}
	}
	
	private static void rotateArray(int[] Arr,int d) {
		
		reverseArray(Arr, 0, d-1);
		reverseArray(Arr, d, Arr.length-1);
		reverseArray(Arr, 0, Arr.length-1);
	}
	
	
	public static void main(String[] args) {
		int Arr[] = {1,2,3,4,5,6,7};
		rotateArray(Arr, 2);
		System.out.println(Arrays.toString(Arr));
	}
	
}

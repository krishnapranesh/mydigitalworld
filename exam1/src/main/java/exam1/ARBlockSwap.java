package exam1;

import java.util.Arrays;

public class ARBlockSwap {

	private static void swapBlock(int arr[],int d,int n) {
		int temp;
		for (int i = 0,j=n+i; i < d; i++,j++) {
		temp = arr[i]; 
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	
	private static void rotateArray(int arr[], int d) {
		int pivot =arr.length-d;
		while(d!=pivot) {
		if (d<=pivot) {
		swapBlock(arr, d, pivot);
		}
		else if (d>pivot) {
		swapBlock(arr, pivot, d);
		}
		pivot-=d;
		
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		rotateArray(arr,d);
		System.out.println(Arrays.toString(arr));
	}
	
	
}

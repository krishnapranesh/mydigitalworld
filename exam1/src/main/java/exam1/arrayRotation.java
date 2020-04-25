package exam1;

import java.util.Arrays;

public class arrayRotation {

	private int[] rotateArray(int[] intArr, int d ,int n) {
		int[] arr1 = new int[n];

		for (int i = 0; i < intArr.length; i++) {
			if(i+d<n) {
			arr1[i]= intArr[i+d];
			}
			else
				arr1[i]= intArr[d-(n-i)];
		}
		return arr1;
			
	}
	
	public static void main(String[] args) {
		int[] sample= {1,2,3,4,5};
		
		arrayRotation arrRotate= new arrayRotation();
		int[] result = arrRotate.rotateArray(sample, 2, 5);
		System.out.println(Arrays.toString(result)) ;
		
	}
	
}

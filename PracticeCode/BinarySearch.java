package PracticeCode;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,10,23,14,17};
		int l = 0;
		int r = 4;
		int x = 23;
		Arrays.sort(arr);
		System.out.println("index of x ix :" + binSearch(arr,l,r,x));

	}
	
	static int binSearch(int[]arr, int l,int r, int x) {
		int mid = l + (r-l)/2;
		if(l<=r) {
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				return binSearch(arr,l,mid-1,x);
			return binSearch(arr,mid+1,r,x);
		}
		return -1;
	}

}

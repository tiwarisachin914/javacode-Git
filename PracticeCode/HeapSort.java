package PracticeCode;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,23,14,17,10,22};
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void heapSort(int [] arr) {
		int len = arr.length;
		for(int i=(len-1)/2;i>=0;i--) {
			heapify(arr,len,i);
		}
		for(int i=len-1;i>=0;i--) {
			int temp =arr[0];
			arr[0]= arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	static void heapify(int [] arr, int n, int i) {
		int largest =i;
		int li= 2*i + 1;
		int ri= 2*i + 2;
		if(li<n && arr[li]>arr[largest]) {
			largest = li;
		}
		if(ri<n && arr[ri]>arr[largest]) {
			largest = ri;
		}
		if(largest !=i) {
			int temp = arr[i];
			arr[i]= arr[largest];
			arr[largest]= temp;
			
			heapify(arr,n,largest);
		}
	}

}

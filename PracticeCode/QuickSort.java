package PracticeCode;

public class QuickSort {
	static void printArray(int []a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low+1;
	    int j = high;
	    int temp;
	    while(i<j) {
	    	while(a[i]<=pivot) {
	 	    	i++;
	 	    }
	 	    while(a[j]>=pivot) {
	 	    	j--;
	 	    }
	 	    if(i<j) {
	 	    	temp = a[i];
	 	    	a[i] = a[j];
	 	    	a[j] = temp;
	 	    }
	    }
	   
	    	temp = a[low];
	    	a[low] = a[j];
	    	a[j]= temp;
	    	
	    return j;
	}
	static void Quicksort(int [] a, int low, int high) {
		int partitionIndex;
		if(low<high) {
			partitionIndex = partition(a,low,high);
			Quicksort(a,low,partitionIndex-1);
			Quicksort(a,partitionIndex+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {22,7,32,8,11,17,16,100};
		//int [] a = {22,7,32,8,11,17,16,23,100};
		int n = a.length;
		printArray(a,n);
		Quicksort(a,0,n-1);
		printArray(a,n);

	}

}

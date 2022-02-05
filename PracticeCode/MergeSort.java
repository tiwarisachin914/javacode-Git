package PracticeCode;

public class MergeSort {
	
	static void merge(int[] a,int l,int m,int h) {
		int i,j,k;
		int [] b = new int[h+1];
		i=l;j=m+1;k=l;
		while(i<=m && j<=h) {
			if(a[i]<a[j]) {
				b[k]=a[i];
				k++; i++;
			}
			else {
				b[k]=a[j];
				k++; j++;
			}
		}
		while(i<= m) {
			b[k]=a[i];
			k++; i++;
		}
		while(j<=h) {
			b[k]=a[j];
			j++; k++;
		}
		
		for(int n=0;n<a.length;n++) {
			a[n]=b[n];
		}
	}
	
	static void mergeSort(int [] a, int l, int h) {
		if(l<h) {
			int m =(l+h)/2;
			mergeSort(a,l,m);
			mergeSort(a,m+1,h);
			merge(a,l,m,h);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {7,1,6,5};
		int low = 0;
		int high = a.length-1;
		mergeSort(a,low,high);
		for(int i=0;i<=high;i++) {
			System.out.println(a[i]);
		}

	}

}

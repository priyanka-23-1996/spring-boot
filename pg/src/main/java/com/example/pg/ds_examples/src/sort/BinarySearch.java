package com.example.pg.ds_examples.src.sort;

public class BinarySearch {

	public static void main(String[] args) {
		// array should be sorted
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		
		int l=0,r=n-1,mid=0;
		binarySearch(arr,l,r,mid);
		

	}

	private static int binarySearch(int[] arr, int l, int r, int mid) {
		int ele=4;
		while(l<=r) {
			mid=(l+r)/2;
			if(arr[mid] == ele)
				return mid;
			else if(arr[mid]< ele)
				l=mid+1;
			else
				r=mid-1;
		}
		return -1;
		
	}

}

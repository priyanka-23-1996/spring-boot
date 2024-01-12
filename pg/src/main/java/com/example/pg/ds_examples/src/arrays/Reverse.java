package arrays;

public class Reverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		int temp=0;
		for(int i=0,j=n-1;i<n/2 && j>=n/2;i++,j--) {
			temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}

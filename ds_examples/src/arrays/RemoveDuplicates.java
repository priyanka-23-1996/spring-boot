package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,3,4,4,5};
		int n=arr.length;
		int j=0;// j is count of elements
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[n-1];
		j++;
		System.out.println("j=" +j);
	//access elements at arr[j] j==5
	for(int i=0;i<j;i++) {
		System.out.println(arr[i]);
	}
	}
}

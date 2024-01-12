package arrays;

public class PeakElementFromNeighbours {

	public static void main(String[] args) {
		
		int arr[] = {3, 1, 3, 20, 4, 1, 0 }; 
		int n=arr.length;
		if(arr[0] > arr[1]) {
			System.out.println("peak element is present at 0 index = " + arr[0]);
		}
		if(arr[n-1] > arr[n-2]) {
			System.out.println("peak elment is present at " + (n-1) +"= " +arr[n-1]);
		}
		for(int i=1;i<n-1;i++) {
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				System.out.println("peak elment is present at " + i +"= " +arr[i]);
			}
		}
		
	}

}

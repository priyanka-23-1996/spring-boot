package arrays;

public class MoveNegativeToStart {
//-12,11,-13,-5,6,-7,5,-3,-6
//-12,-13,11,-5,6,-7,5,-3,-6
//-12,-13,-5,11,6,-7,5,-3,-6
//-12,-13,-5,-7	
//-12 -13 -5 -7 -3 -6 11 6 5
	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int temp = 0;
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start <= end) {

			if (arr[start] > 0 && arr[end] < 0) {
					temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					start++;
					end--;

			}
			else if(arr[start] > 0 && arr[end] > 0) {
				end--;
			}
			else if(arr[start] < 0 && arr[end] <0) {
				start++;
			}
			else if(arr[start] < 0 && arr[end] >0) {
				start++;
				end--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}

package arrays;

public class Sort012 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 0, 2, 1, 1, 0, 0, 0 };
		int count0 = 0, count1 = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count0++;
			else if (arr[i] == 1)
				count1++;
			else
				count2++;

		}
		int j = 0;
		while (j < count0) {
			arr[j] = 0;
			j++;
		}
		while (j < count0 + count1) {
			arr[j] = 1;
			j++;
		}
		while (j < count0 + count1 + count2) {
			arr[j] = 2;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

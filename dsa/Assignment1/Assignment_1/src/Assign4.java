import java.util.Scanner;

public class Assign4 {

	public static int binarySearch(int[] arr, int key, int left, int right) {
		if(left > right)
			return -1;
		int mid = (left + right) / 2;
		
		if(key == arr[mid])
			return mid;
		
		else if(key > arr[mid])
			return binarySearch(arr, key, left, mid-1);
		
		else
			return binarySearch(arr, key, mid+1, right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {99,88,77,66,55,44,33,22,11};
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key, 0, arr.length-1);
		
		if(index != -1) {
			System.out.println(key + " found at index : " + index);
		}
		else {
			System.out.println("Key not found");
		}
	}

}

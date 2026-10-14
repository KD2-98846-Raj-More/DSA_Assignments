import java.util.Scanner;

public class Assign2 {
	
	public static int linear(int[] arr, int key) {
		for(int i=arr.length-1; i>=0; i--) {
			if(key == arr[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {12,34,54,34,23,34,65,7,12,54};
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linear(arr, key);
		if(index != -1)
			System.out.println(key + " found at index " + index);
		else 
			System.out.println("Key not found");
	}

}

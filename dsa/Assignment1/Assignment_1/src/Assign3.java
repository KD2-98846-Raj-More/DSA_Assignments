import java.util.Scanner;

public class Assign3 {
	
	public static void linearSearch(int[] arr, int key) {
		int count=0;
		for(int i = arr.length-1; i>=0; i--) {
			if(key == arr[i])
				count++;
		}
		
		if(count > 0)
			System.out.println("Key : " + key + "   Count : " + count);
		else 
			System.out.println("Element not found");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {12,34,54,34,23,34,65,7,12,54};
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		linearSearch(arr,key);
	}
}
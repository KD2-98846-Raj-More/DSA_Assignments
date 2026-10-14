
public class Assign8 {
	public static int firstNonRepeatedElem(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count == 1)
				return arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int index = firstNonRepeatedElem(arr);
		if(index != -1)
			System.out.println("First non repeating element : " + index);
		else 
			System.out.println("There is no non repeating element");
	}

}

import java.util.Scanner;

public class Assign5 {
	public static int fibonacci(int n) {
		if(n==1)
			return 0;
		
		if(n==2)
			return 1;
		
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
	}

}

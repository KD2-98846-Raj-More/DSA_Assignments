import java.util.Scanner;

public class Assign2 {
	private int[] arr;
	private int SIZE;
	private int top;
	
	public Assign2(int size) {
		SIZE = size;
		top = SIZE;
		arr = new int[SIZE];
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top--;
			arr[top] = value;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			temp = arr[top];
			top++;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			temp = arr[top];
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assign2 assign2 = new Assign2(4);
		int ch;
		
		 do{
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. display");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter value : ");
				int value = sc.nextInt();
				assign2.push(value);
				break;
				
			case 2:
				System.out.println("Popped values : " + assign2.pop());
				break;
				
			case 3:
				System.out.println("Peeked value : " + assign2.peek());
				break;
				
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}while(ch!=0);
		
		
		
	}

}

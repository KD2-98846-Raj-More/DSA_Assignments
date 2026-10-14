import java.util.Scanner;

public class Assign1 {
	private int[] arr;
	private int SIZE;
	private int rear;
	private int front;
	
	public Assign1(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE;
	}
	
	public void offer(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			arr[rear] = value;
			rear++;
		}
	}
	
	public int poll() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			temp = arr[front];
			front++;
			
			if(front == rear) {
				front = rear = -1;
			}
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			temp = arr[front];
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Assign1 a = new Assign1(4);
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit\n1. offer\n2. poll\n3. peek\n4. display");
			System.out.print("Enter your choice : ");
			choice =  sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter value : ");
				int value = sc.nextInt();
				a.offer(value);
				break;
				
			case 2:
				System.out.println("Polled value : " + a.poll());
				break;
				
			case 3:
				System.out.println("Peeked value : " + a.peek());
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice != 0);
		
	}

}

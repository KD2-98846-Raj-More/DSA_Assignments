import java.util.Scanner;

public class Assign3 {
	private int SIZE;
	private int front;
	private int rear;
	private int[] arr;
	private int count;
	public Assign3(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front=rear=-1;
		count=0;
	}
	
	public void offer(int value) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			rear = (rear+1) % SIZE;
			arr[rear] = value;
			count++;
		}
		System.out.println("Count : " + count);
	}
	
	public int poll() {
		int temp=-1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[(front + 1) % SIZE];
			front = (front + 1) % SIZE;
			
			if(front==rear) {
				front=rear=-1;
			}
			System.out.println("Popped value : " + temp);
			count--;
		}
		return temp;
				
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[(front + 1) % SIZE];
		}
		return temp;
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assign3 a = new Assign3(4);
		int ch;
		
		do {
			System.out.println("0. Exit\n1. offer\n2. poll\n3. peek");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.print("Enter value : ");
				int value = sc.nextInt();
				a.offer(value);
				break;
				
			case 2:
				System.out.println("Count : " + a.poll());
				break;
				
			case 3:
				System.out.println("Peeked value : " + a.peek());
				break;
				
			default:
				break;
			}
			
		}while(ch!=0);
	}

}

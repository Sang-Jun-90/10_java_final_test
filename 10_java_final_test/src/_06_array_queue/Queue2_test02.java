package _06_array_queue;

class que {
	private int front;
	private int rear;
	private int stackSize;
	private char[] list;
	
	que(int n){
		front = -1;
		rear = -1;
		stackSize = n;
		list = new char[stackSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	public boolean isFull() {
		return (rear == stackSize-1);
	}
	public void push(char data) {
		if(isEmpty()) {
			front = -1;
			rear = -1;
		}
		if(isFull()) {
			System.out.println("isFull");
		}
		else {
			list[++rear] = data;
			System.out.println("Inserted Item : " + data);
		}
	}
	public char delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
			return 0;
		}
		else {
			return list[++front];
		}
	}
	public void print() {
		if(isEmpty())
			System.out.printf("Array Queue is empty!! %n %n");
		else{
			System.out.printf("Array Queue>> ");
			for(int i=front+1; i<=rear; i++)
				System.out.printf("%c ", list[i]);
			System.out.println();System.out.println();
		}
	}
	
}


public class Queue2_test02{
	public static void main(String args[]){
		char deletedItem;
		int size = 3;
		que Q = new que(size);
		

		Q.push('A');
		Q.print();
		
		Q.push('B');
		Q.print();
		
		deletedItem = Q.delete();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.print();
		
		Q.push('C');
		Q.print();
		
		deletedItem = Q.delete();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.print();

		deletedItem = Q.delete();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.print();		
		
		deletedItem = Q.delete();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.print();	
		
	}
}
package _06_array_queue;
class ArrayQueue1 {
	
	private int front;
	private int back;
	private int queueSize;
	private char[] itemArray;
	
	public ArrayQueue1(int queueSize){
		this.front = -1;
		this.back = -1;
		this.queueSize = queueSize;
		this.itemArray = new char[queueSize];
	}
	
	public boolean isEmpty() {
		return (front == back);
	}
	
	public boolean isFull() {
		return (back == this.queueSize-1);
	}
	
	public void push(char item) {
		if(isEmpty()) {
			this.front = -1;
			this.back = -1;
		}
		if(isFull()) {
			System.out.println("Full");
		}
		else {
			itemArray[++back] = item;
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public char delete() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			return itemArray[++front];
		}
	}
	
	public void printQueue(){
		if(isEmpty())
			System.out.printf("Array Queue is empty!! %n %n");
		else{
			System.out.printf("Array Queue>> ");
			for(int i=front+1; i<=back; i++)
				System.out.printf("%c ", itemArray[i]);
			System.out.println();System.out.println();
		}
	}
	
	
}

public class Queue2_test{
	public static void main(String args[]){
		int queueSize = 3;
		char deletedItem;
		ArrayQueue1 q = new ArrayQueue1(queueSize);
		

		
		
		
		
	}
}
package _07_array_circle_queue;

interface Que {
	
	boolean isEmpty();
	boolean isFull();
	void enQue(char item);
	char deQue();
	void delete();
	char peek();
	void print();
	
}

class ArrayQue implements Que {
	
	private int front;
	private int rear;
	private int queSize;
	private char[] array;
	
	public ArrayQue(int queSize) {
		this.front = 0;
		this.rear = 0;
		this.queSize = queSize;
		this.array = new char[queSize];
	}

	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	@Override
	public boolean isFull() {
		return (((rear + 1) % queSize) == front);
	}

	@Override
	public void enQue(char item) {
		if(isFull()) {
			System.out.println("isFull");
		}
		else {
			rear = (rear + 1) % queSize;
			array[rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char deQue() {
		if(isEmpty()) {
			System.out.println("isEmpty");
			return 0;
		}
		else {
			front = (front + 1) % queSize;
			return array[front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("isEmpty");
		}
		else {
			front = (front + 1) % queSize;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("isEmpty");
			return 0;
		}
		else {
			return array[(front+1) % this.queSize];	
		}
	}

	@Override
	public void print() {
		if(isEmpty())
			System.out.println("Array Circular Queue is empty!!");
		else{
			System.out.printf("Array Circular Queue>> ");
			for(int i=(front+1) % this.queSize; i!=(rear+1)% this.queSize; i=++i % this.queSize)
				System.out.printf("%c ", array[i]);
			System.out.println();  System.out.println();
		}
	}

	
}


public class Queue03{
	public static void main(String args[]){
		
		int size = 4;
		char del;
		
		ArrayQue Q = new ArrayQue(size);
		Q.enQue('A');
		Q.print();
	
	}
}
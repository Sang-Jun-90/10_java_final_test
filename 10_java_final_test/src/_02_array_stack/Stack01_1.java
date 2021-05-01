package _02_array_stack;

class ArrayStack1 {
	
	private int top;   //바로 앞의 순 top만 바라본다는 것이 핵심 
	private int stackSize;  // 스택 사이즈 
	private char itemArray[]; // 아이템 배열 
	
	public ArrayStack1(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == this.stackSize-1);
	}
	public void push(char item) {  // 문자 밀어 넣기 
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
			System.out.println("top : " + top);
		}
	}
	public char pop() {  // 마지막 문자 꺼내기 
		
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		}
		else {
			return itemArray[top--];
		}
		
	}
	
	public void delete() {  // 마지막 문자 삭제하기 
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		}
		else {
			top--;
		}
	}
	public char peek() {  // 마지막 문자 보여주기 
		
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		}
		else {
			return itemArray[top];
		}
		
	}
	public void printStack() {
		
		if(isEmpty()) System.out.printf("Array Stack is empty!! %n %n");
		else{
			System.out.printf("Array Stack>> ");
			for(int i=0; i<=top; i++)
				System.out.printf("%c ", itemArray[i]);
			System.out.println();	System.out.println();
		}
	}
	
	
}


public class Stack01_1{
	public static void main(String args[]){

		int stackSize = 5;
		char deletedItem;
		ArrayStack1 S = new ArrayStack1(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();	
		System.out.println();
		
	}
}
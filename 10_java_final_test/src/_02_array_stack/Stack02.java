package _02_array_stack;

	class stack {
		
		private int top;
		private int stackSize;
		private char[] stackList;
		
		stack (int size){
			top = -1;
			stackSize = size;
			stackList = new char[stackSize];
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		public boolean isFull() {
			return (top == stackSize-1);
		}
		
		void insert(char data) {
			
			if(isFull()) {
				System.out.println("isFull");
				return;
			}
			else {
				stackList[++top] = data;
			}
			
		}
		void delete() {
			if(isEmpty()) {
				System.out.println("isEmpty");
				return;
			}
			else {
				top--;
			}
		}
		public char pop() {
			if(isEmpty()) {
				System.out.println("isEmpty");
				return 0;
			}
			else {
				return stackList[top--];
			}
		}
		public char peek() {
			
			if(isEmpty()) {
				System.out.println("isEmpty");
				return 0;
			}
			else {
				return stackList[top];
			}
		}
		
		void print() {
			
			if(isEmpty()) return;
			System.out.print("Stack >> ");
			for (int i = 0; i <= top; i++) {
				System.out.print(stackList[i]);
				if(i != top) {
					System.out.print(" , ");
				}
				
			}
			System.out.println();
		}
		
	}



public class Stack02{
	public static void main(String args[]){
		int arraySize = 5;
		stack S = new stack(arraySize);
		
		S.insert('A');
		S.insert('B');
		S.insert('C');
		S.insert('D');
		S.print();
		
		S.delete();
		S.print();
		
		System.out.println(S.pop());
		S.print();
		
		System.out.println(S.peek());
		
	}
}
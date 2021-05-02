package _03_list_stack;

interface Stack1 {
	
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
	
}

class StackNode1 {
	
	char data;
	StackNode1 link;
	
}

class LinkedNode1 implements Stack1 {
//  DATA - A / LINK - NULL
//  DATA - B / (DATA - A / LINK - NULL)
//  DATA - C / (DATA - B / (DATA - A / LINK - NULL))
	
	
//	public 
	StackNode1 top; // 앞선 노드의 값을 표시 
	
	@Override
	public boolean isEmpty() {
		return (top ==null);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		StackNode1 newNode = new StackNode1();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : " + item);
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else top = top.link;
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			return top.data;
		}
		
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else {
			StackNode1 temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
	
}




public class ListStack_01_1{
	public static void main(String args[]){		
		
		char deletedItem;
		LinkedNode1 LS = new LinkedNode1();

		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LS.printStack();	 	
	}
}
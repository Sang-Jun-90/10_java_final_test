package _03_list_stack;

	interface stack1 {
		boolean isEmpty();
		void push(char data);
		void delete(); 
		char peek();
		void print();
		char pop();
	}
	
	class stackNode1 {
		char data;
		stackNode1 link;
	}
	
	class linkedStack1 implements stack1 {
		
		stackNode1 top;

		@Override
		public boolean isEmpty() {
			return (top == null);
		}

		@Override
		public void push(char data) {
			stackNode1 newNode = new stackNode1();
			newNode.data = data;
			newNode.link = top;
			top = newNode;
			System.out.println("Inserted Item : " + data);
		}

		@Override
		public void delete() {
			if(isEmpty()) {
				System.out.println("is Empty");
				return;
			}
			else {
				top = top.link;
			}
		}

		@Override
		public char peek() {
			if(isEmpty()) {
				System.out.println("is Empty");
				return 0;
			}
			else {
				return top.data;
			}
		}

		@Override
		public void print() {
			System.out.println("Linked Stack>> ");
			stackNode1 temp = top;
			while(temp.link != null) {
				System.out.println("\t" + temp.data);
				temp = temp.link;
			}
			System.out.println("\t" + temp.data);
			temp = null;
		}

		@Override
		public char pop() {
			if(isEmpty()) {
				System.out.println("is Empty");
				return 0;
			}
			else {
				stackNode1 temp = top;
				top = top.link;
				return temp.data;
			}
		}
		
	}


public class ListStack02{
	public static void main(String args[]){		

		char deletedItem;
		linkedStack1 LS = new linkedStack1();
		
		LS.push('A');
		LS.print();
		
		LS.push('B');
		LS.print();
		
		LS.push('C');
		LS.print();
		
		deletedItem = LS.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LS.print();	
		
	}
}
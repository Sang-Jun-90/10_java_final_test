package _04_stack_calc1;

	interface stack{
		boolean isEmpty();
		void push(char data);
		char peek();
		void delete();
		char pop();
		void print();
	}
	
	class stackLink {
		char data;
		stackLink link;
	}
	
	class linkedList implements stack {

		stackLink top;
		
		@Override
		public boolean isEmpty() {
			return (top == null);
		}

		@Override
		public void push(char data) {
			stackLink newStack = new stackLink();
			newStack.data = data;
			newStack.link = top;
			top = newStack;
		}

		@Override
		public char peek() {
			
			if (isEmpty()) {
				System.out.println("isEmpty");
				return 0;
			}
			else {
				return top.data;
			}
		}

		@Override
		public void delete() {
			if (isEmpty()) {
				System.out.println("isEmpty");
			}
			else {
				top = top.link;
			}
		}

		@Override
		public char pop() {
			if (isEmpty()) {
				System.out.println("isEmpty");
				return 0;
			}
			else {
				stackLink temp = top;
				top = top.link;
				return temp.data;
			}
		}

		@Override
		public void print() {
			if(isEmpty())
				System.out.printf("Linked Stack is empty!! %n %n");
			else{
				stackLink temp = top;
				System.out.println("Linked Stack>> ");
				while(temp != null){
					System.out.printf("\t %c \n", temp.data);
					temp = temp.link;
				}
			}
			System.out.println("------------");	
		}
		
	}


	class check {
		
		private String exp;
		private int expSize;
		private char alpha, omega;
		
		public boolean checkExp(String data) {
			
			this.exp = data;
			expSize = data.length();
			linkedList L = new linkedList();
			
			for (int i = 0; i < expSize; i++) {
				alpha = exp.charAt(i);
				switch(alpha) {
					case '[': case '{': case '(': 
						L.push(alpha); L.print(); break;
					case ']': case '}': case ')': 
						if(L.isEmpty()) {
							L.print();
							return false;
						}
						else {
							omega = L.pop();
							if( omega == '[' && alpha != ']' ||
								omega == '{' && alpha != '}' ||	
								omega == '(' && alpha != ')' ) {
								L.print();
								return false;
							}
							else {
								L.print();
								break;	
							}
						}
				}
			}
			if(L.isEmpty()) return true;
			else return false;
		}
		
		
	}
	


public class StackCalc3{
	
	public static void main(String args[]){
		

		check C = new check();
		
		String exp1 = "(3*5)-(6/2)";
		String exp2 = "(3*5}-(6/2)";
		String exp3 = "{(3*5)-(6/2)}";
		String exp4 = "{(3*5)-(6/2})";
		
		boolean a = C.checkExp(exp1);
		boolean b = C.checkExp(exp2);
		boolean c = C.checkExp(exp3);
		boolean d = C.checkExp(exp4);
		
		if(a) System.out.println("괄호맞음!");
		else System.out.println("괄호틀림!");
		if(b) System.out.println("괄호맞음!");
		else System.out.println("괄호틀림!");
		if(c) System.out.println("괄호맞음!");
		else System.out.println("괄호틀림!");
		if(d) System.out.println("괄호맞음!");
		else System.out.println("괄호틀림!");

			
		
		
	}
}


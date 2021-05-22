package _04_stack_calc1;

// 괄호가 잘쓰였는지 검사하는 방법(스택을 사용) 

class StackNode{
	char data;
	StackNode link;
}

class LinkedStack {
	private StackNode top;
	
	// isEmpty , push , pop , delete, peek, print                             
	// 비었는지 검사 먼저;
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			char temp = top.data;
			top = top.link;
			return temp;
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			}
		else {
			top = top.link;
		}
	}
	public char peek() {
		if(isEmpty()){
		System.out.println("Peeking fail! Linked Stack is empty!!");
		return 0;
	}
	else 
		return top.data;
	}
	public void printStack() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else{
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null){
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
		}
		System.out.println();	
	}
	}
	
}

class OptExp{
	
	private String exp;
	private int expSize;
	private char testCh, openPair;

	public boolean testPair(String exp) {
		
		this.exp = exp;
		LinkedStack S = new LinkedStack();
		expSize = exp.length();
		
		for (int i = 0; i < expSize; i++) {
			testCh = exp.charAt(i);
			switch (testCh) {
				case '(' : case '[' : case '{' :
				S.push(testCh);break;
				case ')' : case ']' : case '}' :
				if(S.isEmpty()) {
					return false;
				}
				else {
					openPair = S.pop();
					
					if(openPair == '(' && testCh != ')'||
					   openPair == '[' && testCh != ']'||	
					   openPair == '{' && testCh != '}' ) {
						return false;
					}
					else break;
					
				}
					
			}
			
		}
		if (S.isEmpty()) return true;
		else return false;
	}
	
}

public class StackCalc2{
	
	public static void main(String args[]){
		
		OptExp opt = new OptExp();
		
		String exp = "(3*5)-(6/2)";
		boolean pairCheck = opt.testPair(exp);
		
		if(pairCheck) System.out.println("괄호맞음!");
		else System.out.println("괄호틀림!");
			
		
		
	}
}


package _05_stack_calc2;

class stack {
		int data;
		stack link;
	}
	
	class LinkedStack {
		private stack top;
			
		public boolean isEmpty(){
			return (top == null); 
		}
		
		public void push(int item){
			stack newNode = new stack();
			newNode.data = item;
			newNode.link = top;
			top = newNode;		
		}
		
		public int pop(){
			if (isEmpty()) {
				System.out.println("Deleting fail! Linked Stack is empty!!");
				return 0;
			}
			else{ 
				int item = top.data;
				top = top.link;
				return item;	
			}				
		}	
	}

	class cal {
		
		private String testString;

		char testChar;
		
		public int calculation(String example) {
			LinkedStack L = new LinkedStack();
			int first,  second;
			char testChar;
			this.testString = example;

			int value;
			for (int i = 0; i < 7; i++) {
				testChar = testString.charAt(i);
				if(testChar != '+' && testChar != '-' && testChar != '*' && testChar != '/' ) {
					value = testChar - '0';
					L.push(value);
					
				}
				else {
					second = L.pop();
					first = L.pop();
//					System.out.println("first : " +first + " //" + "second : " + second);
					switch(testChar) {
						case '+' : L.push(first + second);break;
						case '-' : L.push(first - second);break;
						case '*' : L.push(first * second);break;
						case '/' : L.push(first / second);break;
					}
					
				}
				
			}
			
			return L.pop();
		}
		
	}
	

public class StackCalc3{
	public static void main(String args[]){
		
		LinkedStack LS = new LinkedStack();
		
		
		int result;
		String exp = "35*62/-";	
		System.out.printf("\n후위표기식 : %s", exp);
		cal C = new cal();
		result = C.calculation(exp);
		System.out.printf("\n 연산결과 =  %d \n", result);		
	}
}
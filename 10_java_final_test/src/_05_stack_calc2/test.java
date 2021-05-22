package _05_stack_calc2;

class stackNode {
	char item;
	stackNode link;
}

class linkedNStack {
	private stackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}
		else {
			int item = top.item;
			top = top.link;
			return top.item;
		}
	}
	
}

public class test {

	public static void main(String[] args) {
		
		

	}

}

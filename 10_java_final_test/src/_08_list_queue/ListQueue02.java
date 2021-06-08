package _08_list_queue;

interface que {
	boolean isEmpty();
	void enQueue(char data);
	char deQueue();
	void delete();
	char peek();
	void printQueue();
}

class queLink{
	char data;
	queLink link;
	
	queLink(char data){
		this.data = data;
		link = null;
	}
	
}


class linkQue implements que {
	
	queLink front;
	queLink rear;
	
	public linkQue() {
		front = null;
		rear = null;
	}
	

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public void enQueue(char data) {
		queLink newNode = new queLink(data);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
		System.out.println("Inserted Item : " + data);
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("is empty");
			return 0;
		}
		else {
			char item = front.data;
			front = front.link;
			if(front == null) rear = null;
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("is empty");
		}
		else {
			front = front.link;
			if(front == null) rear = null;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("is empty");
			return 0;
		}
		else {
			return front.data;
		}
	}

	@Override
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("is empty");
		}
		else {
			queLink temp = front;
			while(temp != null) {
				System.out.print(temp.data);
				if(temp.link != null) System.out.print("->");
				temp = temp.link;
			}
			System.out.println();
		}
	}
	
}


public class ListQueue02{
	public static void main(String args[]){		
		char deletedItem;
		linkQue LQ = new linkQue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LQ.printQueue();

		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LQ.printQueue();		
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		LQ.printQueue();	
	}
}
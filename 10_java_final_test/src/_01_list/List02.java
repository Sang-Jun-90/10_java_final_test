package _01_list;

class linkedList2{
	
	private linkNode head;
	
	public linkedList2(){
		head = null;
	}
	
	public void append(int data) {
		
		linkNode newNode = new linkNode(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			linkNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
		
		
	}
	public void delete(int data) {
		
		linkNode tempNode = head;
		while(tempNode.link != null) {
			
			if(tempNode.link.data == data) {
				tempNode.link = tempNode.link.link;
			}
			tempNode = tempNode.link;
		}
		
	}
	public void print() {
		
		linkNode tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.link;
		}
		System.out.println();
	}
	
	public void reverse() {
		
		linkNode next = head;
		linkNode current = null;
		linkNode pre = null;
		
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
		
		
	}
	
}

class linkNode {
	
	int data;
	linkNode link;
	
	linkNode (int data){
		this.data = data;
		link = null;
	}

}


public class List02 {

	public static void main(String[] args) {

		linkedList2 L = new linkedList2();
		L.append(1);
		L.append(2);
		L.append(3);
		L.append(4);
		L.print();
		
		L.delete(3);
		L.print();
		
		L.reverse();
		L.print();
		
		
	}

}

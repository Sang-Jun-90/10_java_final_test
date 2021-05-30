package _01_list;

class nodeLink {
	
	int data;
	nodeLink next = null;
	
	nodeLink(int d){
		this.data = d;
	}
	
	void append(int d) {
		nodeLink end = new nodeLink(d);
		nodeLink n = this;
		// this 는 처음 만들어진 노드 
		
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		nodeLink n = this;
		
		while(n.next != null) {
			if(n.next.data == d) {
				nodeLink temp = n.next.next;
				n.next = temp;
			}else {
				n = n.next;
			}
		}
	}
	
	void print() {
		nodeLink n = this;
		
		while(n.next !=null) {
			System.out.print(n.data);
			if(n.next != null) System.out.print("->");
			n = n.next;
		}
		System.out.println(n.data);
		
		
	}
	
}




public class List02{
	
	public static void main(String args[]){
		
		nodeLink L = new nodeLink(1);
		L.append(2);
		L.append(3);
		L.append(4);
		L.print();
		
		L.delete(3);
		L.print();
		
		L.delete(4);
		L.print();
		
	}
}

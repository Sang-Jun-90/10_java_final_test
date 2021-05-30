//package _01_list;
//
//<<<<<<< HEAD
//class nodeLink {
//	
//	int data;
//	nodeLink next = null;
//	
//	nodeLink(int d){
//		this.data = d;
//	}
//	
//	void append(int d) {
//		nodeLink end = new nodeLink(d);
//		nodeLink n = this;
//		// this 는 처음 만들어진 노드 
//		
//		while(n.next != null) {
//			n = n.next;
//		}
//		n.next = end;
//	}
//	
//	void delete(int d) {
//		nodeLink n = this;
//		
//		while(n.next != null) {
//			if(n.next.data == d) {
//				nodeLink temp = n.next.next;
//				n.next = temp;
//			}else {
//				n = n.next;
//			}
//		}
//	}
//	
//	void print() {
//		nodeLink n = this;
//		
//		while(n.next !=null) {
//			System.out.print(n.data);
//			if(n.next != null) System.out.print("->");
//			n = n.next;
//		}
//		System.out.println(n.data);
//		
//		
//	}
//	
//}
//
//
//
//
//public class List02{
//	
//	public static void main(String args[]){
//		
//		nodeLink L = new nodeLink(1);
//		L.append(2);
//		L.append(3);
//		L.append(4);
//		L.print();
//		
//		L.delete(3);
//		L.print();
//		
//		L.delete(4);
//		L.print();
//		
//	}
//=======
//class linkedList2{
//	
//	private linkNode head;
//	
//	public linkedList2(){
//		head = null;
//	}
//	
//	public void append(int data) {
//		
//		linkNode newNode = new linkNode(data);
//		
//		if(head == null) {
//			head = newNode;
//		}
//		else {
//			linkNode temp = head;
//			while(temp.link != null) {
//				temp = temp.link;
//			}
//			temp.link = newNode;
//		}
//		
//		
//	}
//	public void delete(int data) {
//		
//		linkNode tempNode = head;
//		while(tempNode.link != null) {
//			
//			if(tempNode.link.data == data) {
//				tempNode.link = tempNode.link.link;
//			}
//			tempNode = tempNode.link;
//		}
//		
//	}
//	public void print() {
//		
//		linkNode tempNode = head;
//		while(tempNode != null) {
//			System.out.print(tempNode.data + "->");
//			tempNode = tempNode.link;
//		}
//		System.out.println();
//	}
//	
//	public void reverse() {
//		
//		linkNode next = head;
//		linkNode current = null;
//		linkNode pre = null;
//		
//		while(next != null) {
//			pre = current;
//			current = next;
//			next = next.link;
//			current.link = pre;
//		}
//		head = current;
//		
//		
//	}
//	
//}
//
//class linkNode {
//	
//	int data;
//	linkNode link;
//	
//	linkNode (int data){
//		this.data = data;
//		link = null;
//	}
//
//}
//
//
//public class List02 {
//
//	public static void main(String[] args) {
//
//		linkedList2 L = new linkedList2();
//		L.append(1);
//		L.append(2);
//		L.append(3);
//		L.append(4);
//		L.print();
//		
//		L.delete(3);
//		L.print();
//		
//		L.reverse();
//		L.print();
//		
//		
//	}
//
//>>>>>>> branch 'master' of https://github.com/Sang-Jun-90/10_java_final_test
//}

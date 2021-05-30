package _01_list;

class LinkedList1{
	
	private ListNode1 head;
	
	public LinkedList1() {
		head=null;
		System.out.println();
	}
	
	public void insertMiddleNode(String data, ListNode1 pre) {
		ListNode1 newNode = new ListNode1(data);
		
		
	}
	public void insertLastNode(String data) {
		ListNode1 newNode = new ListNode1(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			ListNode1 temp = head;
		}
		
	}
	public void deleteLastNode() {
		
	}
	public ListNode1 searchNode() {
		
		return head;
	}
	public void reverseList() {
		
	}
	public void printList() {
		
	}
	
	
}

class ListNode1 {
	
	private String data;
	public ListNode1 link;
	
	public ListNode1(){
		this.data =  null;
		this.link = null;
	}
	public ListNode1(String data){
		this.data =  data;
		this.link = null;
	}
	public ListNode1(String data,ListNode1 link){
		this.data =  data;
		this.link = link;
	}
	
	public String getData() {
		return data;
	}
	
}

public class List01_1{
	
	public static void main(String args[]){
		
		LinkedList1 L = new LinkedList1();
		
	}
}

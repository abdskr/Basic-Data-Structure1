class Node{
	int data;
	Node next;

	Node(int val){
	this.data=val;
	this.next=null;

	}
}

class LinkedList1{
	public static void main(String[] args){
	Node head=new Node(12);
	Node n2=new Node(23);
	Node n3=new Node(33);
	Node n4=new Node(43);
	Node n5=new Node(53);
	Node n6=new Node(63);
	Node n7=new Node(73);
	Node n8=new Node(83);
	head.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;
	n6.next=n7;
	n7.next=n8;

	Node newNode = new Node(5);
	newNode.next=head;
	head=newNode;
	int count=0;

	Node current=head;
	while(current!=null){
	System.out.println(current.data+" ");
	current=current.next;
	count++;
	}

	System.out.println("No of nodes:"+count);
	}
}
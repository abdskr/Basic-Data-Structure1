class Node{
	int data;
	Node next;


	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedList{
	Node head;

	public LinkedList(){
		this.head=null;
	}

	public boolean isListEmpty(){
		return head==null;
	}

	public void addToFront(int data){
		Node newNode=new Node(data);
		if(isListEmpty()){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}

	public void getFrontItem(){
		if(isListEmpty()){
			System.out.print("List is Empty");
			return;
		}
		System.out.println(head.data);
}

public void removeFrontItem(){
	if(isListEmpty()){
			System.out.print("List is Empty");
			return;
		}
		head=head.next;
}

public void printAll(){
	if(isListEmpty()){
		System.out.print("List is Empty");
		return;
	}

	Node temp=head;
	while(temp!=null){
		System.out.println(temp.data);
		temp=temp.next;
	}

}


}
class LinkedList2{
	public static void main(String[] args){
		LinkedList n=new LinkedList();
		n.addToFront(10);
		n.addToFront(20);
		// n.getFrontItem();
		n.removeFrontItem();
		n.printAll();
	}
}
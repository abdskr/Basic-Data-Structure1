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

 	public  boolean isListEmpty(){
 		return head==null;
 	}

 	public void addToFront(int data){
 		Node newNode=new Node(data);

 		if(isListEmpty()){
 			System.out.println("List is Empty");
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
 			System.out.println("First item is: "+head.data);
 		}

 		public void removeFrontItem(){
 			if(isListEmpty()){
 				System.out.print("List is Empty");
 			return;
 			}
 			head=head.next;
 		}

 		public void addBack(int data){
 			Node newNode=new Node(data);
 			if(isListEmpty()){
 				System.out.print("List is Empty");
 			head=newNode;
 			}
 			Node temp=head;
 			while(temp.next!=null){
 				temp=temp.next;
 			}
 			temp.next=newNode;


 		}

 		public void printAll(){
 			Node current=head;
 			while(current!=null){
 				System.out.println(current.data);
 				current=current.next;
 			}
 		}


 	}
 public	class LinkedPractice{
 	public static void main(String[] args){
 		LinkedList n=new LinkedList();
 		n.addToFront(10);
		n.addToFront(15);
		n.addBack(20);
		n.removeFrontItem();
 		n.printAll();

 	}
 }

 
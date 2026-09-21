class Node{
	int data;
	Node next;


	public Node(int val){
		this.data=val;
		next=null;
	}

}

class Queue_pr{
	Node rear;
	Node front;

	

	public void enqueue(int val){
		Node n=new Node(val);
		if(rear==null){
			front=rear=n;
		}
		rear.next=n;
		rear=n;
	}

	public int dequeue(){
		if(front==null){
			System.out.println("Queue UnderFlow");
			return -1;
		}
		int val=front.data;
		front=front.next;
		return val;
	}

		public int peek(){
			return front.data;

		}


	public static void main(String[] args){
		Queue_pr q=new Queue_pr();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("Dequeue is:"+q.dequeue());
		System.out.println("Peeked is:"+q.dequeue());

	}

}
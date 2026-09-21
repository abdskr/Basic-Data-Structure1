
class Dynamic_Queue{
	
	private static class Node{
		int data;
		Node next;

			public Node(int size){
				this.data=size;
				this.next=null;
			}


	}

	Node rear;
	Node front;

	public void enqueue(int val){
		Node n=new Node(val);

		if(rear==null){
			front=rear=n;
			return;
		}
		else{
			rear.next=n;
			rear=n;
		}
	}

	public int dequeue(){
		if(front==null){
			System.out.println("Queue UnderFlow");
			return -1;
		}
		
			int val=front.data;
			front=front.next;
		
		if(front==null){
			rear=null;
		}
		return val;
	}

	public int peek(){
		return front.data;
	}

	public static void main(String[] args){
		Dynamic_Queue q=new Dynamic_Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("Dequeue is:"+q.dequeue());
	}
} 
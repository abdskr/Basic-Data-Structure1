class QueueArr{
	String[] arr;
	int rear;
	int front;
	int size;
	QueueArr(int s){
		arr=new String[s];
		this.rear=-1;
		this.front=0;
		size=0;
	}


	public void enqueue(String val){
		if(isFull()){
			System.out.println("QUeue is Full");
		}
	rear=(rear+1)%arr.length;
		arr[rear]=val;
		
		size++;
	}

	public String dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String val=arr[front];
		arr[front]=null;
		front=(front+1)%arr.length;
		size--;
		return val;
	}

	boolean isFull(){
		return size==arr.length;
	}

	boolean isEmpty(){
		return size==0;
	}

	public static void main(String[] args){
		QueueArr q=new QueueArr(7);
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("D");
		System.out.println("Dequeue element is:"+q.dequeue());
		System.out.println("Dequeue element is:"+q.dequeue());

	}
}

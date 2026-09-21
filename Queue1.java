class Queue1{
private	int[] arr;
private int front; 
private int rear; 
private int count; 

	
		public Queue1(int size){
			arr=new int[size];
			front=0;
			rear=-1;
			count=0;
		}


		public void enqueue(int val){


			int index=(rear+1)%arr.length;
			arr[index]=val;
			rear=index;
			count++;
			System.out.println("Enqueud :"+val);
				
			
		}

		public int dequeue(){

			int val=arr[front];
			arr[front]=0;
			front=(front+1)%arr.length;
			
			count--;
			return val;
		}

		public int peek(){
			return arr[front];
		}

		public static void main(String[] args){
			Queue1 queue=new Queue1(7);
			queue.enqueue(10);
			queue.enqueue(20);
			queue.enqueue(30);
			queue.enqueue(40);

			System.out.println("Front item :"+queue.peek());
			System.out.println("Dequeud item :"+queue.dequeue());
			System.out.println("Dequeud item :"+queue.dequeue());


		}
}
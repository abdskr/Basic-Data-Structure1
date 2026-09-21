
class  Node{
	int data;
	Node next;

	Node(int val){
		this.data=val;
		this.next=null;
}

}

class StackEx{
Node top;

	public void push(int val){
		Node n=new Node(val);

		n.next=top;
		top=n;
	}

	public int pop(){
		if(top==null){
			System.out.println("Stack underFlow");
			return 0;
		}
		int val=top.data;
		top=top.next;
		return val;
	}

	public int peek(){
		return top.data;
	}


		public static void main(String[] args){
			StackEx stack=new StackEx();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
			stack.push(70);
			stack.push(80);
			stack.push(90);
			stack.push(100);
			stack.push(110);
			System.out.println("Poped number is: "+stack.peek());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
			System.out.println("Poped number is: "+stack.pop());
		}

}


	

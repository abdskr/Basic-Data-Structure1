class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class Main{
    public static void main(String[] args){
        Node head=new Node(10);
        Node n2=new Node(23);
        Node n3=new Node(45);
        Node n4=new Node(56);
      
      head.next=n2;
      n2.next=n3;
      n3.next=n4;

      Node temp=head;
      while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
      }
    
    }

}
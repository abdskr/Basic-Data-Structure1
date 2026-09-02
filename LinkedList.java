class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class LinkedList{
    public static void main(String[] args){
        Node head=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);

        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        
        Node temp=head;

        Node NewNode=new Node(5);
        

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
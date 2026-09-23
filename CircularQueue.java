class CircularQueue1{
    Strin[] arr;
    int front, rear, size;

    CircularQueue1(int capacity){
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String item){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = item;
        size++;
    }

    public String dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        String item = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return item;
    }

    public String peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        return arr[front];
    }
}

    class CircularQueue{
    public static void main(String[] args){
        CircularQueue1 q=new CircualarQueue1(5);
        q.enqueue("A");
          q.enqueue("b");
            q.enqueue("C");
              q.enqueue("D");
                q.enqueue("E");
                  q.enqueue("F");
                    q.enqueue("G");
            System.out.println("Dequeued elemnet is :"+q.dequeue());
            System.out.println("Dequeued elemnet is :"+q.dequeue());
    }
}
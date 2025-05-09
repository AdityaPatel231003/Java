public class LinkedLists {
    public  static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Queue{
        static Node head=null;
        static Node tail=null;

        public  boolean isEmpty(){
            if(head==null && tail==null){
                return true;
            }
            return false;
        }
        public  void add(int data){
            Node newNode =new Node(data);
            if (isEmpty()) {
                head=tail=newNode;
                
            }
            tail.next=newNode;
            tail=newNode;
            return;

        }
        public  int remove(){
            
            if (isEmpty()) {
                head=tail=null;
                return -1;
                
            }
            int front=head.data;
            head=head.next;
            return front;

        }
        public int Peek(){
            
            if (isEmpty()) {
                head=tail=null;
                return -1;
                
            }
            int front=head.data;
            return front;
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
       
        q.add(101); q.add(1);  q.add(2);  q.add(3);  q.add(4);  q.add(5);
        while (!q.isEmpty()) {
            System.out.println( q.Peek());
             q.remove();   
         }

    }
    
}

public   class UsingLinkedLists{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class Stack{
        public static Node head=null;
        // isEmpty
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        
        // push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()|| head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            return;
        }
        // pop
        public static int pop(){
            
            if(isEmpty()|| head==null){
                return -1;
            }
            int top=head.data;
            head=head.next;

            return top;
        }
        // peek
        public static int peek(){
            
            if(isEmpty()|| head==null){
                return -1;
            }
            int top=head.data;
            return top;
        }


    }

    public static void main(String[] args) {
        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}
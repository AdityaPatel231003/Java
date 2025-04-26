public  class Even_odd {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        // add
        public  void addlast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
            tail=newNode;
            
        }
         // Print
 public void print(){
    if(head==null){
        System.out.println("null");
        return;
    }
    Node temp=head;
   
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
         // Print
         public void print(Node head){
            if(head==null){
                System.out.println("null");
                return;
            }
            Node temp=head;
           
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    }
    public static void main(String[] args) {
        Node dd =new Node(2);
        dd.addlast(8);
        dd.addlast(12);
        dd.addlast(10);
        dd.addlast(5);
        dd.addlast(4);
        dd.addlast(1);
        dd.addlast(6);
        dd.print();

        Node h=divideEvenOdd(dd.head,2,2);
        dd.print(h);

    }

    public static Node divideEvenOdd(Node he,int m,int n){
        

        Node temp=he;
        Node evenh=new Node(-1);
        Node even=evenh;
        Node oddh=new Node(-1);
        Node odd=oddh;
        while (temp!=null) {
            if(temp.data%2==0){
                even.next=temp;
                even=even.next;
                temp=temp.next;
            }
          else if(temp.data%2!=0) {
                odd.next=temp;
               odd=odd.next;
               temp=temp.next;
            }                     
        }
        even.next=oddh.next;
        odd.next=null;

        return evenh.next;
    }

    
}
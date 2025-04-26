public class Swapping {
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
        dd.addlast(1);
        dd.addlast(2);
        dd.addlast(3);
        dd.addlast(4);
        dd.addlast(5);
        dd.addlast(6);
        dd.print();

        Node h=Swap(dd.head,2,5);
        System.out.println("a");
        dd.print(h);
        System.out.println("n");

    }
    public static Node Swap(Node he,int m,int n){
        Node curr=he;
        Node xh=he;
        Node yh=he;
        Node x=xh;
        Node y=yh;

        Node prev_y=null;
        Node prev_x=null;

        while(curr!=null ){
            if(x.data!=m){
                prev_x=x;
                x=x.next;

            }
            if(y.data!=n){
                prev_y=y;
                y=y.next;

            }
curr=curr.next;
        }


                // swap
            prev_y.next=y.next;
            prev_x.next=y;
            y.next=x.next;
            x.next=prev_y.next;
            prev_y.next=x;


        // curr=he;

//         while(curr!=null ){
//             if(x.data!=m){
//                 prev_x=x;
//                 x=x.next;

//             }
//             if(y.data!=n){
//                 prev_y=y;
//                 y=y.next;

//             }
// curr=curr.next;

//         }
        return he;
    }
    
}

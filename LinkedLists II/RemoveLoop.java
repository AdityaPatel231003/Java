public class RemoveLoop {
    public   static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        head=new Node(1);
       Node temp=new Node(2);
       head.next=temp;
       head.next.next=new Node(3);
       head.next.next.next=new Node(4);
       head.next.next.next.next=temp;
      
       Removeloops_cycle();
      Node print=head;
      while(print!=null){
        System.out.print(print.data+"->");
        print=print.next;
      }
      System.out.println("null");
    }
    public  static void Removeloops_cycle(){
        // Detect loop
        Node Slow=head;
        Node fast=head;
        boolean loop=false;
        while(fast!=null && fast.next!=null){
            Slow=Slow.next;
            fast=fast.next.next;
            if(fast==Slow){
                loop=true;
                break;
            }
        }

        if(loop==true){
                Slow=head;
                Node prev=null;
                while(Slow!=fast){
                    prev=fast;
                    Slow=Slow.next;
                    fast=fast.next;

                }
                prev.next=null;
        }
    }
    
}

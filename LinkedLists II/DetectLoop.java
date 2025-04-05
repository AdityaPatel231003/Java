import java.util.LinkedList;
public class DetectLoop{
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
       head.next.next.next=temp;

      System.out.println(isCycle());
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        } 
        return false;
    }

}
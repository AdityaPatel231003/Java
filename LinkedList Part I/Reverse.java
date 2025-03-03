public class Reverse {
    public class Node{
        int data;
        Node next;
       public  Node(int data){
        this.data=data;
        this.next=null;
       }
    }
    public Node head;
    public Node tail;

    // Add at First

    public  void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    // print
    public void Print(){
        Node temper=head;
        while(temper!=null){
            System.out.print(temper.data+"->");
            temper=temper.next;
        }
        System.out.println("null");

    }

    // Reverse;
    public void RV(){
        Node prev=null;
        Node current=tail=head;
        Node next;
        while(current!=null){
           next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
     
        head=prev;
        
    }
    public static void main(String[] args) {
        Reverse ll=new Reverse();
        ll.AddFirst(5); 
         ll.AddFirst(4);  
         ll.AddFirst(3); 
          ll.AddFirst(2);  
         ll.AddFirst(1);  
        ll.Print();
        ll.RV();
        ll.Print();
    }
    
}

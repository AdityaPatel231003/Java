public class LinnkedList_Pallindrome {
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
public Node mid(Node head){
    Node Slow=head;
    Node Fast=head;
    while(Fast!=null && Fast.next!=null){
        Slow=Slow.next;
        Fast=Fast.next.next;
    }
return Slow;
}
    // Pallindrone
    public boolean Pall(){
        if(head==null || head.next==null){
            return true;
        }
        // Slow Fast Technique
       Node midNode=mid(head);
    //    Reverse 2nd Half
    Node prev=null;
    Node Curr=tail=midNode;
    Node next;
    while(Curr!=null){
        next=Curr.next;
        Curr.next=prev;
        prev=Curr;
        Curr=next;
    }

    Node Right=prev;
    Node left=head;
    while(Right!=null){
        if(left.data!=Right.data){
            return false;
        }
        left=left.next;
        Right=Right.next;
    }

    return true;


    }
    public static void main(String[] args) {
       LinnkedList_Pallindrome ll=new LinnkedList_Pallindrome();
        ll.AddFirst(5); 
         ll.AddFirst(4);  
         ll.AddFirst(3); 
          ll.AddFirst(2);  
         ll.AddFirst(1);  
        ll.Print();
       System.out.println( ll.Pall());
    

        

    }
    
}

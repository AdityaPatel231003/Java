public class FindandRemoveNth_Node {
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
    public void Find(int idx){
        Node temp=head;
        int Size=0;
        while (temp!=null) {
            temp=temp.next;
            Size++;
            
        }
        if(idx==Size){
            head=head.next;
            return;
          
        }
        Node prev=head;
        int Start=Size-idx;
        int i=0;
        while(i<Start-1){
            prev=prev.next;
            i++;
        }
       prev.next=prev.next.next;
       return;
        
       
    }
    public static void main(String[] args) {
       FindandRemoveNth_Node ll=new FindandRemoveNth_Node();
        ll.AddFirst(5); 
         ll.AddFirst(4);  
         ll.AddFirst(3); 
          ll.AddFirst(2);  
         ll.AddFirst(1);  
        ll.Print();
        // ll.RV();
        // ll.Print();

        ll.Find(2);
        ll.Print();

    }
    
}

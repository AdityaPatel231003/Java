public  class LinkedLists {
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
    // Add at last
    public  void AddLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
         tail=newNode;

    }
    // Add at middle
    public  void AddMid(int idx,int data){
        Node newNode=new Node(data);
        if(idx==0){
            AddFirst(data);
            return;
        }
        int i=0;
        Node prev=head;
       while(i<idx-1){
        prev=prev.next;
        i++;
       }
       newNode.next=prev.next;
       prev.next=newNode;

    }

// remove First
public int RF(){
    int Size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        Size++;
    }
if(head==null){
    return Integer.MIN_VALUE;

}
else if (head.next==null || Size==1){
    head=tail=null;

}
    int Value=head.data;
    head=head.next;
    return Value;
}
// Remove Last
public int RL(){
    int Size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        Size++;
    }
    if(head==null){
        return Integer.MIN_VALUE;
    
    }
    else if (head.next==null || Size==1){
        head=tail=null;
    
    }
    Node prev=head;
    int i=0;
    while(i<Size-2){
        prev=prev.next;
        i++;
    }


    int Val=prev.next.data;
    prev.next=null;
    tail=prev;
    return Val;
}

    public void Print(){
        Node temper=head;
        while(temper!=null){
            System.out.print(temper.data+"->");
            temper=temper.next;
        }
        System.out.println("null");

    }
// Search
public int Iterative(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
}
public int Helper(int key,Node head){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    return 1+Helper(key,head.next);
}
public int Recursive(int key){
    return Helper(key,head);
}
    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.AddFirst(1);
        ll.AddLast(2);
        ll.AddMid(2,4);
        ll.AddMid(2, 3);
        ll.RF();
        ll.AddFirst(1);
        ll.RL();
        ll.RL();
        ll.AddMid(2,4);
        ll.AddMid(2, 3);
        ll.AddFirst(0);
        ll.RF();
       
        ll.Print();
        System.out.println(ll.Iterative(4));
        System.out.println(ll.Recursive(4));
    }

    
}

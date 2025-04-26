public class Intersectionll {
    public  static class Node{
        Object data;
        Node next;
        public   Node(Object data){
            this.data=data;
            this.next=null;
        }
    }
    
        public Node head;
        public Node tail;

        
        public   void addNode(Object data){
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
            tail=newNode;
            return;  
        }
        // Node 
        public   void addNode(Node data){
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
            tail=newNode;
            return;  
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
        public static void main(String[] args) {
        
           Intersectionll ll1=new Intersectionll();
           Node commonNode=new Node(100);
          Node headll=new Node(1);
          Node headlll=new Node(222);
          headll.next=new Node(2);
          headll.next.next=commonNode;
          headlll.next=new Node (11);
          headlll.next.next= new Node(12);
          headlll.next.next.next=commonNode;
          headlll.next.next.next.next=new Node (13);
          System.out.println("First");
          ll1.print(headll);
          System.out.println("Second ");
          ll1.print(headlll);

         
        //    1-2-100
        // 222-11-12-100-13
        System.out.println(getIntersection(headll,headlll));
        System.out.println("Know");
        Node abc=getIntersection(headll,headlll);
        System.out.println(abc.data);        
        }

public  static Node getIntersection(Node head1,Node head2){
    Node list1=head1;
    Node list2=head2;

    int countl1=0;
    int countl2=0;
    while(list2!=null){
        countl2++;
        list2=list2.next;
    }
    while(list1!=null){
        countl1++;
        list1=list1.next;
    }
     list1=head1;
     list2=head2;
    if(countl1>countl2){
        countl1--;
        list1=list1.next;

    }
    if(countl2>countl1){
        countl2--;
        list2=list2.next;

    }
    while(list1!=list2){
        list1=list1.next;
        list2=list2.next;
    }

    return list1;
}
  
    
}

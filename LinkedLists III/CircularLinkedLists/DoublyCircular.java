// package CircularLinkedLists;

public class DoublyCircular {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;

        }
       
    }
    public Node head;
    public Node tail;
    public int Size=0;

    // Operations / immplemenatation
        // Add At First
        public void addF(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                head.prev=tail;
                tail.next=head;
                return;
            }
 
            newNode.next=head;          
            head=newNode;
            head.prev=tail;
            tail.next=head;             
            return;
        }
          // Add At Last
          public void addL(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                head.prev=tail;
                tail.next=head;
                return;
            }
            tail.next=newNode;           
            newNode.next=head;
            tail=newNode;
            head.prev=tail;
            return;
        }

         // Add At Middle
         public void addM(int data,int idx){
           
            if(idx==0){
                addF(data);
                return;
            }
            if(idx==Size){
                addL(data);
                return;
            }
            Node newNode=new Node(data);
            Size++;
            int i=0;
            Node temp=head;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next.prev=newNode;
            temp.next=newNode;
            
            return;
        }
        // Remove First
        public int RemoveF(){
            Size--;
            int val;
            if (head==null){
                return Integer.MIN_VALUE;
            }
            if(head.next==head){
                val=head.data;
                head=tail=null;               
                return val;
            }
            val=head.data;
            head=head.next;
            head.prev=tail;
            tail.next=head;
            return val;

        }
        // Remove Last
        public int RemoveL(){
            Size--;
            int val;
            if (head==null){
                return Integer.MIN_VALUE;
            }
            if(head.next==head){
                val=head.data;
                head=tail=null;               
                return val;
            }
            val=head.data;
           Node temp=head;
           while (temp.next!=tail) {
            temp=temp.next;
            
           }
           temp.next.prev=null;
           temp.next=head;
           tail=temp;
           head.prev=tail;
            return val;

        }

         // Remove Middle
         public int RemoveM(int idx){
            if(idx==0){
                return RemoveF();
            }
            if(idx==Size){
                return RemoveL();
                
            }
            int i=0;      
            Node temp=head;   
            while(i<idx-1){
                temp=temp.next;
                i++;
            } 
            int val;
            val=temp.next.data;
            temp.next.next.prev=temp;
            temp.next=temp.next.next; 
            Size--;
            return val;

        }

        // print
        public void print(){
            Node temp=head;
          if(head==null){
            System.out.println("null");
          }
          do {
            System.out.print(temp.data+"<->");
            temp=temp.next;
          } while (temp!=head);
          System.out.println("HEAD");
          return;

        }
  

    public static void main(String[] args) {
        DoublyCircular Dc=new DoublyCircular();
        Dc.addF(2);
        Dc.addF(1);
        Dc.addL(3);
        Dc.addM(101, 3);
        Dc.addM(121, 0);
        Dc.print();

        Dc.RemoveF();
        Dc.RemoveL();
        Dc.RemoveM(1);
        Dc.print();
        
    }
}

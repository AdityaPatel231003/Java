
public class Doubly{

        public  static class Node{
            int data;
            Node next;
            Node prev;
            public Node(int data){
                this.data=data;
                this.next=null;
                this.prev=null;
            }
        }
        public static Node head;
        public  static Node tail;
        public int Size=0;

        // Add at First
        public   void addF(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
            
            
        }
        //  Add at Last
        public void addl(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            return;
        }
        // Add at Middle
        public void addM(int data,int idx){
            Node newNode=new Node(data);
            
            if(idx==0){
                addF(data);
                return;
            }
            if(idx==Size){
                addl(data);
                return;
            }
            Size++;
            Node temp=head;
            int i=0;
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

        // Remove first
        // Add at First
        public  int RemoveF(){
            int val;
            if(head==null){
                return Integer.MIN_VALUE;
            }
            if(head.next==null){
               
                 val=head.data;
                 head=tail=null;
                return val;
            }
            val=head.data;
            head=head.next;
            head.prev=null;
            Size--;
           
            return val;
            
            
        }
        // Remove Last
        public int RemoveL(){
            int val;
            if(head==null){
                return Integer.MIN_VALUE;
            }
            if(head.next==null){
               
                 val=head.data;
                 head=tail=null;
                return val;
            }
            
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;

            }
            val=temp.next.data;
            temp.next=null;
            Size--;
           
            return val;

        }
        // Remove Middle
        public int RemoveM(int idx){
            if(idx==0){
                
                return  RemoveF();
            }
           
            int i=0;
            Node temp=head;
            while(i<idx-1){
                temp=temp.next;
            }

            int val=temp.next.data;
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
            Size--;
            return val;

        }
        // Print
        public void print(){
            if(head==null){
                System.out.println("null");
                return;
            }
            Node temp=head;
           
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        // Reverse
        public Node Reverse(Node head){
            Node prev=null;
            Node curr=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                curr.prev=next;
                prev=curr;;
                curr=next;
            }
            head=prev;
            return head;

        }
    
    public static void main(String[] args) {
        Doubly dd=new Doubly();
      
        dd.addF(4);
        dd.addF(3);
        
        dd.addF(1);
        dd.addl(5);
        dd.addM(2, 1);

        dd.print();
        
        // dd.RemoveF();
        // dd.RemoveL();
        // dd.RemoveM(1);
       dd.head= dd.Reverse(dd.head);
        
        dd.print();
        

        
        
    }
    
}



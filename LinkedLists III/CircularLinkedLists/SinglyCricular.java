// package CircularLinkedLists;

public class SinglyCricular {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
            public Node head;
            public Node tail;
            public int Size;
  
        
        // Add At First
        public void addF(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                tail.next=head;
                return;
            }
            tail.next=newNode;
            newNode.next=head;
            head=newNode;
            return;
        }
          // Add At Last
          public void addL(int data){
            Node newNode=new Node(data);
            Size++;
            if(head==null){
                head=tail=newNode;
                tail.next=head;
                return;
            }
            tail.next=newNode;
            newNode.next=head;
           tail=newNode;
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
            tail.next=head.next;
            head=head.next;
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
           temp.next=head;
           tail=temp;
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
            System.out.print(temp.data+"->");
            temp=temp.next;
          } while (temp!=head);
          System.out.println("HEAD");
          return;

        }
    
    public static void main(String[] args) {
        SinglyCricular scll=new SinglyCricular();
        scll.addF(3);
        scll.addF(2);
        scll.addF(1);
        scll.addL(101);
        scll.addM(121, 3);
        scll.print();

        // scll.RemoveF();
        // scll.RemoveL();
        //  scll.RemoveM(3);
        scll.print();

    }

}


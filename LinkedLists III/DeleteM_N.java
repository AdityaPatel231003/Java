public  class DeleteM_N {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        // add
        public  void addlast(int data){
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
            newNode.next=null;
            tail=newNode;
            
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

    }
    public static void main(String[] args) {
        Node dd =new Node(2);
        dd.addlast(1);
        dd.addlast(2);
        dd.addlast(-3);
        dd.addlast(-4);
        dd.addlast(-5);
        dd.addlast(-6);
        dd.print();

        Node h=De(dd.head,2,2);
        dd.print(h);
        System.out.println("h");

    }
    public static Node De(Node he,int m,int n){
        Node curr=he;
        // Node t=null;
        while (curr!=null && curr.next!=null) {
            for(int i=1;i<m && curr!=null ;i++){
                curr=curr.next;
            }
          Node  t=curr.next;
            for(int j=1;j<=n && t!=null;j++){
                t=t.next;
            }
            curr.next=t;
            curr=t;
            
        }
        return he;
    }

    
}

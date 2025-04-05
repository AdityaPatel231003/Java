public class MergeSort {
    public static class LinkedLists{
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;

            }
        }
      public Node head;
      public Node tail;

        // Add
        public   void  Add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            return;

        }  
        // print
        public    void  print(){
            Node temp=head;
            if(head==null){
                System.out.print("null");
                return;
            }
           while(temp!=null){
               System.out.print(temp.data+"->");
               temp=temp.next;
            }
           System.out.println("null");
           return;
        }


        public  Node Sorting(Node head){
            if(head==null || head.next==null){
                return head;
            }
            // getMid
            Node midNode=getMid( head);

            Node Leftpart=head;
            Node Rightpart=midNode.next;
            midNode.next=null;
            

            Node LP=Sorting(Leftpart);
            Node RP=Sorting(Rightpart);

            return Merged(LP,RP);


        }
        public  Node Merged(Node Left,Node Right){
            Node mergedll=new Node(-1);
            Node temp=mergedll;

            while(Left!=null && Right!=null){
                if(Left.data<=Right.data){
                    temp.next=Left;
                    Left=Left.next;
                    temp=temp.next;
                }
                else{
                    temp.next=Right;
                    Right=Right.next;
                    temp=temp.next;
                }
            }
            while(Left!=null){
                temp.next=Left;
                Left=Left.next;
                temp=temp.next;

            }
            while(Right!=null){
                temp.next=Right;
                Right=Right.next;
                temp=temp.next;

            }
            return mergedll.next;
        }

        public  Node getMid(Node head){
            Node slow=head;
            Node fast =head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    }

   
    

    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.Add(5);  ll.Add(4);  ll.Add(3);  ll.Add(1);  ll.Add(2);
        ll.print();
        ll.head= ll.Sorting(ll.head);
        ll.print();
    }

   
}
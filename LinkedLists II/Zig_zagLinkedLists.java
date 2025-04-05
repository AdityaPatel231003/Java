public class Zig_zagLinkedLists {
    public  static class LinkedList{
        public class Node {
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
            public Node head;
            public Node tail;

            public void add(int data){
                Node newNode=new Node(data);
                if(head==null){
                    head=tail=newNode;
                    return;
                }
                newNode.next=head;
                head=newNode;
                return;
            }
            public void print(){
                if(head==null){
                    System.out.print("null");
                    return;

                }
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
                System.out.println("null");
                return;
                 }

                 public void zig_zag(Node head){
                    // getMid
                    Node midNode=getMid(head);
                    // Reverse 2nd half           
                    Node Right=midNode.next;
                    midNode.next=null;
                   Node RightHead= Reverse(Right);
                   Node leftHead=head;

                //    MergedAlternative
                 merged(leftHead,RightHead);
                 return;
                 }

                 public Node getMid(Node head){
                    Node slow=head;
                    Node fast=head;
                    while (fast!=null && fast.next!=null) {
                        slow=slow.next;
                        fast=fast.next.next;                   
                    }
                    return slow;
                 }
                 public Node Reverse(Node Right){
                    Node prev=null;
                    Node curr=Right;
                    Node next;
                    while(curr!=null){
                        next=curr.next;
                        curr.next=prev;
                        prev=curr;
                        curr=next;
                    }
                   
                    return prev;
                 }
                 public void merged(Node left_h,Node right_h){
                    Node next_L;
                    Node next_R;
                    while(left_h!=null && right_h!=null){
                        next_L=left_h.next;
                        left_h.next=right_h;
                        next_R=right_h.next;
                        right_h.next=next_L;

                        left_h=next_L;
                        right_h=next_R;

                    }
                    return;
                    

                 }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(5); ll.add(4);  ll.add(3);  ll.add(2);  ll.add(1);  
        ll.print();
        ll.zig_zag(ll.head);
        ll.print();
    }

    
}

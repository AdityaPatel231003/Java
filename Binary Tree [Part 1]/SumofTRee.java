public class SumofTRee {
    static class Node{
          int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

       int S= Sum(root);
       System.out.println("Sum of all nodes of  tree is  "+S);

    }
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
       
       int leftSum=Sum(root.left);
       int rightSum=Sum(root.right);
       return leftSum+rightSum+root.data;
    }
    
}

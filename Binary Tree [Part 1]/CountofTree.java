public class CountofTree {
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

       int C= Count(root);
       System.out.println("Count of tree is  "+C);

    }
    public static int Count(Node root){
        if(root==null){
            return 0;
        }
       
        int leftCount=Count(root.left);
        int rightCount=Count(root.right);
        return leftCount+rightCount+1;

    }
    
}

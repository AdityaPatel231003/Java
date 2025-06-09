public class BuildTree{
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
      static class Tree{
        static int idx=-1;

            public static Node BuildBinaryTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null;
                }
                Node newNode=new Node(nodes[idx]);
                newNode.left=BuildBinaryTree(nodes);
                newNode.right=BuildBinaryTree(nodes);

                return newNode;
        }
        }
    public static void main(String[] args) {
        // Tree t=new Tree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=Tree.BuildBinaryTree(nodes);
        System.out.println("Root of BinaryTree is"+root.data);
        
    }
}
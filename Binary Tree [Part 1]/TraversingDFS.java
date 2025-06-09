public class TraversingDFS {
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

             public static void PreorderTravering(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            PreorderTravering(root.left);
            PreorderTravering(root.right);

        }
        public static void InorderTraversing(Node root){
            if(root==null){
                return;
            }
            InorderTraversing(root.left);
            System.out.print(root.data+" ");
            InorderTraversing(root.right);
        }

        public static void PostOrderTraversing(Node root){
               if(root==null){
                return;
            }
            PostOrderTraversing(root.left);
            PostOrderTraversing(root.right);
            System.out.print(root.data+" ");
            

        }
    public static void main(String[] args) {
        // Tree t=new Tree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root=Tree.BuildBinaryTree(nodes);
        System.out.println("Root of BinaryTree is "+root.data);

        System.out.println("Preorder Traversing ");
        PreorderTravering(root);

        System.out.println(" ");
        System.out.println("Inorder Traversing ");
        InorderTraversing(root);
        
        System.out.println(" ");
        System.out.println("Postorder Traversing ");
        PostOrderTraversing(root);
    }
    
}

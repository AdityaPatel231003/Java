import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        NGRight(arr);
        System.out.println();
        NGLeft(arr);
        System.out.println();
        NSmallerRight(arr);
        System.out.println();
        NSmallerLeft(arr);
    }
    public static void NGRight(int []arr){
        Stack<Integer>s=new Stack<>();
        int next[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]+" ");
        }
    }
    

    public static void NGLeft(int []arr){
        Stack<Integer>s=new Stack<>();
        int next[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]+" ");
        }
    }

    public static void NSmallerLeft(int []arr){
        Stack<Integer>s=new Stack<>();
        int next[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[i]<=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]+" ");
        }
    }

    public static void NSmallerRight(int []arr){
        Stack<Integer>s=new Stack<>();
        int next[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[i]<=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]+" ");
        }
    }
    
    

}

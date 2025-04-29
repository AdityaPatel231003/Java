// package Implementation
public class UsingArray {
    public static int arr[]=new int [100];
    public static int top=-1;

    // isEmpty
    public static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    // isfull
    public static boolean isfull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }
    // Push
    public static void push(int data){
        // overflow
        if (isfull() || top==arr.length-1) {
            System.out.println("Stack is full data could be losed on insertion beacuse of overflow"); 
            return;   
        }
        else{
            top=top+1;
            arr[top]=data;
            return;
        }   
    }
    // pop
    public static int pop(){
        // overflow
        if (isEmpty() || top==-1) {
            System.out.print("Stack is empty data could  not be get beacuse of underflow"); 
            return -1;   
        }
            int popedElement=arr[top];
            arr[top]=0;
            top=top-1;
            return popedElement;
           
    }
// peek
public static int peek(){
    // overflow
    if (isEmpty() || top==-1) {
        System.out.print("Stack is empty "); 
        return -1;   
    }
        int popedElement=arr[top];
        return popedElement;
       
}
public static void main(String[] args) {
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//     push(0); push(1); push(2); push(3); push(4); push(0); push(1); push(2);  push(12); push(13);
//    push(12); push(101);

   
System.out.println("Top =="+peek());
System.out.println(pop());
    while (!isEmpty()) {
        System.out.println("Top =="+peek());
        System.out.println(pop());
        
    }
    
}
    
}

public class CircularQueue {

        
        
        int Size=5;
        int arr[]=new int[Size];
        int rear=-1;
        int front=-1;
       
 
          public boolean isEmpty(){
             if(rear==-1 && front==-1){
                 return true;
             }
             return false;
          }
          public boolean isFull(){
             if( ((rear+1)%Size) ==front){
                 return true;
             }
             return false;
          }
 
          public void add(int data){
             if(isFull()){
                 System.out.println("Queue is Full");
                 return;
             }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%Size;
            arr[rear]=data;
            return;
          }
          public int remove(){
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             
             int result=arr[front];
             if(front==rear){
                front=rear=-1;
                return result;
             }
             front=(front+1)%Size;
             return result;
          }
          public int Peek(){
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             
             int result=arr[front];
             return result;
          }

          public static void main(String[] args) {
            CircularQueue q=new CircularQueue();
           
            
            q.add(101); q.add(1);  q.add(2);  q.add(3);  q.add(4);  q.add(5);
            while (!q.isEmpty()) {
                System.out.println( q.Peek());
                 q.remove();   
             }
          }
          
    
}

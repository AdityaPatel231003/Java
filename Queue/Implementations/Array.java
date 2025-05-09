public class Array {

    static class Queue{
       static int arr[];
       static int Size;
       static int rear;
       static int front;
         public  Queue(int n){
           arr= new int[n];
           Size=n;
           rear=-1;
           front=0;

         }

         public boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
         }
         public boolean isFull(){
            if(rear==Size-1){
                return true;
            }
            return false;
         }

         public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
            return;
         }
         public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            
            int result=arr[front];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];

                
            }
            rear=rear-1;
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
    }


    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);  q.add(2);  q.add(3);  q.add(4);  q.add(5);

        while (!q.isEmpty()) {
           System.out.println( q.Peek());
            q.remove();   
        }
        
    }
}

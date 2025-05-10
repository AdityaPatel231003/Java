import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static class Stack{
        Deque<Integer>dq=new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
           public int pop(){
           return dq.removeLast();
        }
         public int peek(){
           return dq.getLast();
        }
        public boolean isEmpty(){
            if(dq.isEmpty()){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1); s.push(2); s.push(3); s.push(4); s.push(5);
        while (!s.isEmpty()) {
            System.out.print(" "+s.pop());
        }
    }
}

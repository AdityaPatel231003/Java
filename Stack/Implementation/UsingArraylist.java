// package Implementation;

import java.util.ArrayList;
public class UsingArraylist {

 static ArrayList<Integer> list =new ArrayList<>();
    // isEmpty
    public static boolean isEmpty(){
        if(list.size()==0){
            return true;
        }
        return false;
    }
    // isFull --> No need of it beacuse of dynamic Size Stack using Arraylist in java

    // push
    public static void push(int data){
        // No overflow beacuse of dynamic Size Stack 
        list.add(data);
        return ;
    }
    // pop
    public static  int pop(){
        // underflow 
        if(list.size()==0 || isEmpty()){
            return -1;
        }
        int val=list.get(list.size()-1);
                list.remove(list.size()-1);
        return val;
    }
    // peek
    public static  int peek(){
        // underflow 
        if(list.size()==0 || isEmpty()){
            return -1;
        }
        int val=list.get(list.size()-1);             
        return val;
    }
    public static void main(String[] args) {
        push(0);
        push(1);
        push(2);
        push(3);

        while (!isEmpty()) {
            System.out.println(peek());
            System.out.println(pop());
                 }
        
    }
    
}

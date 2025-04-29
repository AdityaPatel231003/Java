import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        Reverse(s);
        System.out.println("reverse:");
        print(s);
    }
    public static void print(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
        return;
    }

    public static void Reverse(Stack<Integer>s){
            if (s.isEmpty()){
                return;
            } 
        int top=s.pop();
        // 4 3 2 1
        Reverse(s);
        PushAtbottom(s,top);
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        return;
    }
    public static void PushAtbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtbottom(s, data);
        s.push(top);
        return;
    }
    
}

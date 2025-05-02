import java.util.Stack;

public class Duplicate {
    public static void main(String[] args) {
        String str="(((((a+b+c+f)(a))))))))))))))))))))))))))";
        System.out.println(isduplicate(str));
    }
    public static boolean isduplicate(String str){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            // closing
            if(ch==')'){
                int count=0;
                while( s.peek()!='('){
                    count++;
                    s.pop();
                }
               
                if(count<1){
                    return false;
                }
                if (!s.isEmpty()) {
                    
                    s.pop();
                }
                

            }
            else{
                s.push(ch);
            }
            
        }
        return true;
    }
    
}

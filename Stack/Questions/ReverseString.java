import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="AdityaPatel";
        System.out.println(Reversefunction(str));
    }

    public static String Reversefunction(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            char ch=str.charAt(idx);
            s.push(ch);
            idx++;
        }

        StringBuilder sb=new StringBuilder();
        while (!s.isEmpty()) {
          char resultantchar=  s.pop();
          sb.append(resultantchar);
            
        }
        str=sb.toString();
        return str;
    }
    
}

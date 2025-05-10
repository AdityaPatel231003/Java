import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter{
    
    public static void main(String[] args) {
        String Str="aabccxb";
        System.out.println(FirstNonRepeat(Str));
    }
    public static String FirstNonRepeat(String Str){
        StringBuilder sb=new StringBuilder();
        int Count[]=new int[26];
        Queue<Character>q=new LinkedList<>();
         Queue<Integer>Q=new LinkedList<>();
         int top=-1;
        for (int i = 0; i < Str.length(); i++) {
            char ch=Str.charAt(i);
            q.add(ch);
            Q.add(i);
            Count[ch-'a']++;

            while (!q.isEmpty() && Count[q.peek()-'a']>1) {
                q.remove();
                Q.remove();
                
            }
            if(q.isEmpty()){
                sb.append(-1);
                top=-1;
            }
            else{
                sb.append(q.peek());
                top=Q.peek();
            }
        }
        System.out.println("index of Letter (Unique Character idx)  "+top);
        System.out.println("..");
        return sb.toString();
    }
}
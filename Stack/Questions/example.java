import java.util.Stack;

public class example {
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o','h'};
        ans(s);
    }
    public static void ans(char []s){

     Stack<Character>st=new Stack<>();
    int i=0;
        while(i<s.length){
            st.push(s[i]);
            i++;
        }
       
    char output[]=new char[s.length];
    int j=0;
         while(!st.isEmpty()){
            char ans=st.pop();
            output[j]=ans;
            j++;

        }
        for(int k=0;k<s.length;k++){
            System.out.print(output[k] +" ");
        }

        return;
    }
    
}

import java.util.HashSet;

public class RepeatSubsequences {
    
    public static void main(String[] args) {
        String str="aaa";
       HashSet<String> set =new HashSet<>();
        Subseqeuences(str ,"",0,set);
    }
    public static void Subseqeuences(String str,String newstr,int i ,HashSet<String> set){
            if(i==str.length()){
                if(set.contains(newstr)){
                    return;
                }
                else{
                    set.add(newstr);
                    System.out.println(newstr);
                }
                
                return;
            }
        char ch=str.charAt(i);
        Subseqeuences(str, newstr+ch ,i+1,set);
        Subseqeuences(str,  newstr,i+1,set);

    }

}


public class Subsets{
    public static void main(String[] args) {
        String str="abc";
        sub(str,"",0);
        
    }
    public static void sub(String str,String newstr,int i){
        if(i==str.length()){
            System.out.println(newstr);
            
            return;
        }
        char ch=str.charAt(i);
        sub(str, newstr+ch, i+1);
        sub(str, newstr, i+1);

    }
}
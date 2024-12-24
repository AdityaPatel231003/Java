public class Subseqeuences {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str.length());
        
        Sub(str,"",0);
    }
    public static void Sub(String str,String newstr, int i){

if(i==str.length()){
    System.out.println(newstr);
   
    return ;
}
        char ch=str.charAt(i);
        // to do
        Sub(str,newstr+ch,i+1);
        Sub(str, newstr, i+1);
        
    }
}

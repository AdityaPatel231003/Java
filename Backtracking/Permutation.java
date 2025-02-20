public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        sub(str,"");
        
    }
    public static void sub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            
            return;
        }
        
        for(int j=0;j<str.length();j++){
            char ch=str.charAt(j);
            String newstr= str.substring(0,j)+str.substring(j+1);

            sub(newstr,ans+ch);
        }
        

    }
}

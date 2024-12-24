public class LengthOfString {
    public static void main(String[] args) {
        String Str="Google";
        
        System.out.println(length(Str));
    }
    public static int length(String str){
          if(str.length()==0){
                      return 0;
                    }
           return  length(str.substring(1))+1;
    }
    
}

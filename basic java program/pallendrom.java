public class pallendrom {
    public static int rv(int num){
        int ld;
        int rv=0;
        while(num>0){
            ld=num%10;
            rv=(rv*10)+(ld);
           num/=10;

        }
        return rv;
    }
    public static boolean pall(int num){
      int answer =rv(num);
        if(num==answer){
            return true;
            
        }
        else {
            return false;
        }
        
    }
    public static void main (String[]  args){
         boolean ans=pall(122341);
         System.out.println(ans);
    }
}

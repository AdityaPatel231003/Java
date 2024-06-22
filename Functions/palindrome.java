public class palindrome{
    
    public static boolean pall(int n){
        int ans=n;
    int ld;
    int pall=0;

       while(n>0){
        ld=n%10;
        pall=(pall*10)+(ld);
        n=n/10;

     }
   

    if( ans==pall){
        
        return true;

    }
    
       
       
       return false;


    }
    public static void main(String[] args) {
        boolean ans=pall(321);
        System.out.println(ans);
        if(pall(121)){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not a Palllindrome");
        }
    }
}
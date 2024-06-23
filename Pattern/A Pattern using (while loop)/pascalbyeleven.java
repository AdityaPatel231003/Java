public class pascalbyeleven {
    public static int power(int n,int m){
        int pow=1;
        for(int i=1;i<=m;i++){
            pow*=n;

        }
        return pow;
    }
    public static void main(String[] args) {
        
       
        int n=7;
        
        int spaces=n-1;
        int pow=0;
       
        int current=1;
        while(current<=n){
           for(int i=1;i<=spaces;i++){
               System.out.print(" ");
           }
           int ans=power(11, pow);
           System.out.println(ans);
          pow++;
           
           spaces--;
         
           current++;
           
          
        }
           
           }
       }
       

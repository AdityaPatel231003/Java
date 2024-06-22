public class primeInRange{
    
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
        

 public static void Range(int n,int m){
    for(int i=n;i<=m;i++){

        if(prime(i)){
            System.out.print(i +" ");
        }
    }
 }
    public static void main(String[] args) {
        Range(2,100);
        
    }
}
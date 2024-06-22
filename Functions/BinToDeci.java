public class BinToDeci {

    public static int power(int n,int m){
        int pow=1;
        for(int i=1;i<=m;i++){
            pow*=n;
        }
        return pow;

    }
    public static void Binary(int n){
        int ld;
        int deci=0;
        int power=0;
        int Binary=n;

        while(n>0){
            ld=n%2;
            deci+=(ld* power(10, power));
            power++;
            n=n/2;
           

        }
        System.out.println("Decimal of "  + Binary +" is " +deci);
     
        
    }
    public static void main(String[] args) {
            
        Binary(5);    
        
    }
    
}

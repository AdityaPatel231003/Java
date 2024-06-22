public class DeciToBin {
    public static int power(int n,int m){
        int pow=1;
        for(int i=1;i<=m;i++){
            pow*=n;
        }
        return pow;

    }
    public static void deci(int n){
        int ld;
        int binary=0;
        int power=0;
        int deci=n;

        while(n>0){
            ld=n%10;
            binary+=(ld* power(2, power));
            power++;
            n=n/10;
           

        }
        System.out.println("Decimal of "  + deci +" is " +binary);
     
        
    }
    public static void main(String[] args) {
            
        deci(1011);    
        
    }
    
}

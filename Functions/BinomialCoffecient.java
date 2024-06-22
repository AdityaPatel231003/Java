public class BinomialCoffecient {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void BinomialCoffecient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
        int ans=n_fact/(r_fact*n_r_fact);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        BinomialCoffecient(4,2);
    }
    
}

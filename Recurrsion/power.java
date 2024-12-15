public class power {
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(pow((double) x,( long)n));
    }

    public static double pow(double x,long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return pow(1/x,-n);
        }
        if(n%2==0){
           double squ=pow(x,n/2);
            return squ*squ;
        }
        return x*pow(x, (n-1));

    }
}

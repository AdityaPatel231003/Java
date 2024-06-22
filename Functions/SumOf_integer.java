public class SumOf_integer {
    public static void sum(int n){
        int ld;
        int sum=0;
        int rv=0;
        while(n>0){
            ld=n%10;
            sum+=ld;
            rv=(rv*10)+ld;
            n=n/10;

        }
        System.out.println("Sum of integer ="+sum);
        System.out.println("Reverseof integer ="+rv);
    }
    public static void main(String[] args) {
        sum(12345);
    }
    
}

public class sumi{
    public static int sum( int num){
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum+=ld;
            num/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int ans=sum(1234);
        System.out.println(ans);
    }
}
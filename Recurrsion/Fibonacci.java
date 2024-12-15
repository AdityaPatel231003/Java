public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fab(n));
    }

    public static int fab(int n){
            if(n==0 || n==1){
                return n;
            }

            return fab(n-1)+fab(n-2);
    }
}

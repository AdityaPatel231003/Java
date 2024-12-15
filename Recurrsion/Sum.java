public class Sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(S(5));
    }


    public static int S(int n){
        if(n==1){
            return 1;
        }
        return n+S(n-1);
    }
}

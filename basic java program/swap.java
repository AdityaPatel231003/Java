public class swap {
    public static int swap(int a,int b ) {
        a=a+b;
        b=a-b;
        a=a-b;
        return a;


    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
         int ans=swap(a,b);
        System.out.println("a="+a);
        System.out.println(b);
        System.out.println(ans);
    }
}

public class Mathclass {
    public static void MAX_MIN(int a, double b){
        double Max=Math.max(a, b);
        System.out.println("Max="+Max);

        double Min=Math.min(a, b);
        System.out.println("MIN="+Min);

    }
    public static void  square(int n,int m){
        double ans= Math.sqrt(n);
        System.out.println(ans);

        int pow=(int)Math.pow(n,m);
        System.out.println(pow);

        int absolute=(int)Math.abs(-23456);
        System.out.println(absolute);
        
        double ma=Math.ceil(7.9);
        System.out.println(ma);
        double maa=Math.ceil(-7.1);
        System.out.println(maa);
        double maaa=Math.ceil(8);
        System.out.println(maaa);

        double s=Math.sin(30);
        System.out.println(s);
        
    }
    public static void main(String[] args) {
        int a=23;
        double b=23.098d;

        
        MAX_MIN(a,b);
        square(4,2);
       
    }
    
}

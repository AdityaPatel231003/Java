public class power {
    public static int power(int n,int m){
        int pow=1;
        for(int i=1;i<=m;i++){
            pow*=n;
        }
        return pow;

    }
    public static void main(String[] args) {
      int ans=  power(2,0);
      System.out.println(ans);
    }
    
}

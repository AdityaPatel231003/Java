class power55 {
    public static double myPow(double x, int n) {
        
        if(n==0){
            return 1;
        }
        else if(n>0){
            if(n==1){
                return x;
            }
            else{
                double originalX=x;
                for(int i=2;i<=n;i++){
                  x=(originalX*x);
            }
            }
         }
        else{
            if(n==-1){
                return 1/x;
            }
            else{
                int plus=n*-1;
                double OriginalX=1/x;
                for(int i=2;i<=plus;i++){
                    x=(OriginalX)*(1/x);
                 }  
            }
        }

        return x;
        
    }

    public static double solve(double x,long n){
        if(n==0)
        {
            return 1;
        }
        if(n<0){
            return solve(1/x,-n);
        }
        if(n%2==0){
            return solve(x*x,n/2);
        }

        return x*solve(x*x, (n-1)/2);
    }
    public static double OptimizePow(double x,int n){
        return solve(x,(long)n);
    }
    public static void main(String[] args) {
      double ans=  myPow(34.00515,-2);
      System.out.println(ans);
    //   by recursion
      double answer=OptimizePow(34.00515,-3);
      System.out.println(answer);
    }
}
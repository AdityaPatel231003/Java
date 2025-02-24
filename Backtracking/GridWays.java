public class GridWays {
    public static void main(String[] args) {
        // (0,0)->(n-1,m-1)
        int Grid[][]=new int[4][3];
        int ans=Ways(Grid,0,0);
      System.out.println( ans);
    }
    // TC=0(2^(n+m))
    public static int Ways(int Grids[][],int n,int m){
        if(n==Grids.length-1 || m== Grids[0].length-1){
            return 1;
        }
        return Ways(Grids, n, m+1)+Ways(Grids, n+1, m);
    }
    
}

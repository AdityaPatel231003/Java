import java.util.*;


public class TillingProblem {

    public static void main(String args[]){
        // For 2*n  floor
        // Tiles  2*1
        int  n=4;

        System.out.println(Tiles(n));

    }
    public static int Tiles(int n){
if(n==0 || n==1){
    return 1;
}

        int VerticalTiles=Tiles(n-1);
        int HorizontalTiles=Tiles(n-2);
        int TotalWays=VerticalTiles+HorizontalTiles;
        return TotalWays;
    }
  
}

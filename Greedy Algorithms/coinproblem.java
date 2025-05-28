import java.util.Arrays;
import java.util.Comparator;

public class coinproblem {

    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int targetval=4;
        System.out.println(minnumberofcoins(coins,targetval));
    }
    // public static int minnumberofcoins(int coins[], int targetval){
    //     int ans=0;
    //     int cap=targetval;
    //     Arrays.sort(coins);
    //     for (int  i = coins.length-1;i >= 0; i--) {
    //         if (coins[i]<=cap) {
    //             while (coins[i]<=cap) {
    //                 ans++;
    //                 cap-=coins[i];
                    
    //             }
                
    //         }
            
    //     }
    //     return ans;

    // }
     public static int minnumberofcoins(Integer coins[], int targetval){
        int ans=0;
        int cap=targetval;
         Arrays.sort(coins,Comparator.reverseOrder());
        for (int  i=0;i <=coins.length-1; i++) {
            if (coins[i]<=cap) {
                while (coins[i]<=cap) {
                    ans++;
                    cap-=coins[i];
                    
                }
                
            }
            
        }
        return ans;

    }
}
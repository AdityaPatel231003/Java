public class buy_Sell_Stock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println( Bruteforce(prices));
       System.out.println(NComplexity(prices));
    }
    public static int Bruteforce(int prices[]){
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    int profit=prices[j]-prices[i];
                    maxprofit=Math.max(maxprofit,profit);
                }

            }
        }
        return maxprofit;
    }

    public static int NComplexity(int prices[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int profit=prices[i]-buy;
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
    
}

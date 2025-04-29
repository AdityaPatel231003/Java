import java.util.Stack;

public class SpanProblem {
    public static void main(String[] args) {
        ByArray();  
        int Stock[]={60,80,60,70,60,85,100};
        int span[]=new int[Stock.length];
        StockSpan(Stock,span);
        System.out.println("In O(n^2)");
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }  

    }
    public static void StockSpan(int Stock[],int span[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<Stock.length;i++){
            int todaysPrices=Stock[i];
            while(!s.isEmpty() && todaysPrices>=Stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-s.peek();
                
            }   
            s.push(i);       
        }
        return;

    }

    public static void ByArray(){
        // TC-->O(n^2)
        int arr[]={60,80,60,70,60,85,100};
    
        int spann[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=i;
            int n=0;
            while((arr[i]>=arr[j])&& j>=0){
                n=n+1;
                if(j==0){
                    break;
                }
                j=j-1;

            }
            spann[i]=n;
        }
        for(int i=0;i<spann.length;i++){
            System.out.print(spann[i]+" ");
        }
        
    }

 
}

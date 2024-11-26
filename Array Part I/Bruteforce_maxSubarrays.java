public class Bruteforce_maxSubarrays {
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsubarr(arr);
    }
    public static void maxsubarr(int arr[]){  //0(n^3)
        int totalsubarrays=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    totalsubarrays++;
                    sum+=arr[k];
                    
                    
                }
                System.out.print("==>"+sum);
                System.out.println();
                umax=Math.max(max, sum);
                
            }
           
            System.out.println();
        }
        System.out.println("totalsubarrays =>"+totalsubarrays);
        System.out.println("Maximum sum of subarrays ->"+max);
        
    }
}

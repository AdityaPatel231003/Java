public class Largest_Smallest{
    public static int largestArray(int arr[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }
    public static int smallestArray(int arr[]){
        
        int small=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,78};
       System.out.println( "largest array element is=="+ largestArray(arr)); 
       System.out.println("smallest array element is=="+smallestArray( arr));
      
   
}
}
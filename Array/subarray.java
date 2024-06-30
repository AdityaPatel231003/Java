public class subarray {
    public static void subarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]  +" ");
                    sum+=arr[k];
                }
                System.out.print(" ="+sum);
                System.out.println();

                
            }
         System.out.println(" ");
            
        }
    }
  public static void main(String[] args) {
    int  arr[]={2,4,6,8,10};
   
    subarr(arr);
  }  
}


public class Brute_Sub_array {
    
    public static void subarray(int arr[])
    {
        int ts=0; 
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i;j<=arr.length-1;j++)
            {
               for(int k=i;k<=j;k++)
               {
                System.out.print(+arr[k] +" ");
                ts++;
               }
               System.out.println();
               }
              System.out.println();
        }
           
       

        System.out.println("Total subarray "+ts);
       
    } 
       
    

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
} 


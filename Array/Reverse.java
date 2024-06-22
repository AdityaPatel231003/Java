public class Reverse {
   
    public static void ReverseArray(int arr[]){
        int first=0;
        int temp;
        int end=arr.length-1;
        
        while(first<end){
            temp=arr[end];
          arr[end]=arr[first];
          arr[first]=temp;
           
            first++;
            end--;
        }
       
    }
   
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,78};
      System.out.print("Before array calling");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(  +arr[i]);
        }
        System.out.println();
    ReverseArray(arr);

    System.out.print( "After  array calling");
    
    for(int i=0;i<=arr.length-1;i++){
        System.out.print( +arr[i]);
    }
      
   
}
}


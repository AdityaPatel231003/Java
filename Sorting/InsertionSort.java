public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // int arr[]={5,4,1,2,3};
        increasingOrder(arr);
        System.out.print("Array in ascending order  ");
        print(arr);
        decreasingOrder(arr);
        System.out.println();
        System.out.print("Array in descending order ");
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }
    public static void increasingOrder(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
    public static void decreasingOrder(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
}

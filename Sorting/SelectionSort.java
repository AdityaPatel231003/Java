package Sorting;

public class SelectionSort {
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

    public static void increasingOrder(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int minpos=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]>arr[minpos]){
                    minpos=j;
                }
            }
            // swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void decreasingOrder(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int maxpos=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[maxpos]){
                    maxpos=j;
                }
            }
            // swap
            int temp=arr[maxpos];
            arr[maxpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }
    
}

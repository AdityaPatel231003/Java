package Sorting;

public class CountSortNegativeNum {
    public static void main(String[] args) {
        int arr[]={3, 6, 2, -1, 8, 7, 4, 5, 3, 1};
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
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        int Range=max-(min);
        int count[]=new int[Range+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]-(min)]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=(i+(min));
                j++;
                count[i]--;
                
            }

        }
    }
    public static void decreasingOrder(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        int Range=max-(min);
        int count[]=new int[Range+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]-(min)]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i]>0) {
                arr[j]=(i+(min));
                j++;
                count[i]--;
                
            }

        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }
    
}



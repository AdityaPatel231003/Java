public class BinarySearch {
    public static int binary(int arr[],int key){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99,101};
        int key=88;
        System.out.println(binary(arr,key));
    }

    
}
